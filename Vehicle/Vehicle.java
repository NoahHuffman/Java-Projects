package Vehicle;

public class Vehicle implements Efficiency {
    
    //instance variable
    protected double efficiency;

    //vehicle constructor
    public Vehicle(double efficiency) {
        this.efficiency = efficiency;
    }

    //method to print the message
    public void printMessage() {
        System.out.println("I am a vehicle, VROOM!!");
    }

    //Method that returns the name
    public String getName() { return "Vehicle"; } 

    //method that returns the efficiency
    public double getEfficiency() { return efficiency; }

}
