public class Demo2 implements Runnable {

    @Override
    public void run(){
        for(int i = 10; i >5; i--){
            System.out.println("Red Team "+ i);
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }            
        }
        System.out.println("Red Team is sleeping");
    }
    
}
