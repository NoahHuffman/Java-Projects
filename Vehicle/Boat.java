package Vehicle;

public class Boat extends Vehicle {

	//subclass - inherits methods from vehicle
   public Boat(double efficiency) {
       super(efficiency);
   }

   //method that prints the message
   public void printMessage() {
       System.out.println("I am a boat, VROOM!!");
   }

   //method that returns the name
   public String getName() { return "Boat"; }

}
