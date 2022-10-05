public class Demo1 implements Runnable {

    @Override
    public void run(){
        for(int i = 5; i >0; i--){
            System.out.println("Blue Team "+ i);
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }            
        }
        System.out.println("Blue Team is sleeping");
    }
    
}
