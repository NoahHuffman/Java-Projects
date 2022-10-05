import java.util.concurrent.Semaphore;

class Threads implements Runnable{
    //Semaphore which implements mutual exclusion
    Semaphore sem = new Semaphore(1);

    @Override
    public void run(){
        try{

            //Loop to demonstrate which thread has the permit     
            for (int i = 10; i>0; i--){
               
                //Symbolising a thread that wants to access the permit
                System.out.println(Thread.currentThread().getName() + " wants the ball"); 
               
                //Aqcuiring permit, so that only the random thread below can run
                sem.acquire(); 

                Thread.sleep(100);
                System.out.println(Thread.currentThread().getName() + " is playing with the ball");
                
                //Releasing permit, so that a different thread can access the permit
                sem.release(); 
                System.out.println(Thread.currentThread().getName() + " is done playing with the ball");   
                Thread.sleep(100);            
            }

        //catch exceptions
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}

//Demo class to run our Threads class
public class Demo{

    public static void main(String[] args) {
        //Creating object to create multiple threads
        Threads toDo = new Threads();

        //Initializing Threads
        Thread t1 = new Thread(toDo);
        Thread t2 = new Thread(toDo);
        Thread t3 = new Thread(toDo);

        //Naming Threads
        t1.setName("Blue Team");
        t2.setName("Red Team");
        t3.setName("Yellow Team");

        //Starting Threads
        t1.start();
        t2.start();
        t3.start();
    }
}