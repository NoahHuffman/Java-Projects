public class Demo3 implements Runnable {

    @Override
    public void run(){
        for(int i = 15; i >10; i--){
            System.out.println("Yellow Team "+ i);
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }            
        }
        System.out.println("Yellow Team is sleeping");
    }
    
}
