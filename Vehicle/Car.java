package Vehicle;

public class Car extends Vehicle{
    
    //subclass - inherits methods from vehicle
    public Car(double efficiency) {
        super(efficiency);
    }
    
	//method that prints the message
    public void printMessage() {
        System.out.println("I am a car, VROOM!!");
    }

    //Method that returns the name
    public String getName() { return "Car"; }

}
