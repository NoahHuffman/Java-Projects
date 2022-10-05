public class App {
    public static void main(String[] args) throws Exception {

        //Creating Threads
        Demo1 runnable1 = new Demo1();
        Demo2 runnable2 = new Demo2();
        Demo3 runnable3 = new Demo3();
        
        Thread blueTeam = new Thread(runnable1);
        Thread redTeam = new Thread(runnable2);
        Thread yellowTeam = new Thread(runnable3);
        
        

        //Starting Threads
        blueTeam.start();
        redTeam.start();
        yellowTeam.start();

    }
}
