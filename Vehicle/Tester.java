package Vehicle;
import java.util.Random;

public class Tester {
    public static void main(String[] args) throws Exception {

    	//instance variable for number of vehicles
        final int NUM_VEHICLES = 10;

        //Creating place to store vehicles
        Vehicle[] vehicles = new Vehicle[NUM_VEHICLES];

        //generates a random um
        Random rand = new Random();

        //creating randomized vehicles
        for (int i = 0; i < vehicles.length; i++) {
            //0 - creates a vehicle
        	//1 - creates a car
        	//2 - creates a boat 
            switch (rand.nextInt(0, 3)) {
                case 0: 
                    vehicles[i] = new Vehicle(rand.nextInt(0, 100));
                    break;
                case 1: 
                    vehicles[i] = new Car(rand.nextInt(0, 100));
                    break;
                case 2:
                    vehicles[i] = new Boat(rand.nextInt(0, 100));
                    break;
                default: System.out.println("Incorrect Rand Statement");
                    break;
            }
        }

        //prints each message of generated vehicles
        for (Vehicle whole : vehicles) {
            whole.printMessage();
        }
        System.out.println();

        //prints each name and the corresponding efficiency
        for (Vehicle whole : vehicles) {
            System.out.println(whole.getName() + ": " + whole.getEfficiency());
        }
        System.out.println();

        int threshhold = 20;
        
        //gets the first efficiency below the threshold
        Vehicle eff = (Vehicle)getFirstBelowT(vehicles, threshhold);

        //prints out info
        if (eff == null) 
            System.out.println("There were no efficiencies smaller than " + threshhold); 
        else    
            System.out.println("The first object with efficiency less than " + threshhold + " was " + eff.getName() + " with efficiency of " + eff.getEfficiency());

    }

    public static Efficiency getFirstBelowT(Efficiency[] efficiency, double threshhold) {
        for (Efficiency ef : efficiency) 
            //checks if the efficiency is below threshhold
            if (ef.getEfficiency() < threshhold) {
            	return ef;
            }
        return null;
    }
}
