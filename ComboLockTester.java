import java.util.Random;
import java.util.Scanner;

/**
   A test for the ComboLock class.
*/
public class ComboLockTester
{
   public static void main(String[] args)
   {
      
      int[] secrets = {0,0,0}; //3 element array to hold combo
      
      //create a new lock with the combo, default is 0,0,0 from above
      ComboLock lock = new ComboLock(secrets[0], secrets[1], secrets[2]);

      //scanner to read in values
      Scanner in = new Scanner(System.in);
      //loop variable - used for checking if lock is open.  initially locked
      boolean opened = false;
      //which direction are we turning.  tester turns right, then left, right,left ...
      //so we will not allow a user to turn right, then turn right again
      boolean turningRight = true;
      //loop for simulation
      boolean done = false; //keep simulating while not done
      //keep running simulation while not done
      while(!done) {
    	  //read in combo values - 3 new values for this test
    	  int intsRead = 0;
    	  System.out.print("Please enter 3 values for the new combo lock: ");
    	  while(intsRead < 3) {
    		  //next line will crash if user enters other than int
    		  secrets[intsRead] = in.nextInt();
    		  if(secrets[intsRead] > 39) secrets[intsRead] = 39; //clamp value
    		  else if(secrets[intsRead] < 0) secrets[intsRead] = 0; //clamp value
    		  intsRead++;
    	  }
    	  System.out.println();
    	  //make a new lock with the combo
    	  lock = new ComboLock(secrets[0], secrets[1], secrets[2]);
    	  
    	  lock.reset(); //making sure lock is reset before this test
    	  System.out.println("Combo is: " + secrets[0] + " " + 
    			  secrets[1] + " " + secrets[2]);
    	  while (!opened) //while the lock is not open
		  {
    		  //print the current value of the lock
    		  //the number the dial is pointing at
			  System.out.println("Current Number: " + lock.getCurrentNumber());
			  //prompt for input
		     System.out.println("Enter number of ticks to turn to the "
		           + (turningRight ? "right" : "left")
		           + " 0 - 40. Enter an invalid number to quit (negative, or >40).");
		     int ticks = in.nextInt(); //input ticks
		     if ((ticks < 0) || (ticks > 40)) //here we make sure not to send bad values
		     {
		        System.out.println("Invalid entry. The program will now exit.");
		        return;
		     }
		     //turn right or left appropriately
		     if (turningRight) {
		    	 lock.turnRight(ticks);
		     } else {
			     lock.turnLeft(ticks);
		     }
		     //either case, switch directions
		     turningRight = !turningRight;
		     //either case, check if it's open
		     opened = lock.open();
		  } //exit the "open" loop
		  System.out.println("You opened the lock!");
	  
	      System.out.println("Would you like to run simulation again? (Yes or No)");
	      String response = in.next();
	      if(response.charAt(0) == 'y' || response.charAt(0) == 'Y') {
	    	done = false;   //not done
	    	opened = false; 
	    	turningRight = true; //reset for right turn in tester
	      } else {
	    	  done = true;  //finished, exit
	    	  return; //bye bye
	      }
      }
   }
}
