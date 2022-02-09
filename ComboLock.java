/**
   A class to simulate a combination lock. 
*/

public class ComboLock
{

	
  

    private int currentNumber = 0; //current value lock dial is set to
    private int secret1; //first number in combo
    private int secret2; //second number in combo
    private int secret3; //third number in combo
	private boolean pos0 = true; //position at zero
	private boolean num1 = false; //boolean for first combo number
	private boolean num2 = false; //boolean for second combo number
	private boolean num3 = false; //boolean for third combo number
	boolean opened = false; //boolean for whether the lock is locked or unlocked
	final int MaxNum = 40; //variable for maximum number, making it final so it cannot be changed
   
   /**
      Initializes the combination of the lock.
      
   */

   public ComboLock(int secret1, int secret2, int secret3)
   {
	   //sets instance variables equal to local variables
	   this.secret1 = secret1;
	   this.secret2 = secret2;
	   this.secret3 = secret3; 
   }
   
   /**
      Resets the state of the lock so that it can be opened again.
   */
   public void reset()
   {
	  //resets to initial state
      pos0 = true; //position where currentNumber = 0
      num1 = false; //sets it back to having no value
      num2 = false; //sets it back to having no value
      num3 = false; //sets it back to having no value
   }

   /**
      Turns lock left given number of ticks.
      @param ticks number of ticks to turn left
   */
   public void turnLeft(int ticks) 
   {
	   //if num1 is true 
	   if (num1) {
		   //sets currentNumber equal to input + currentNumber, resetting it if it goes over 40, then continuing counting 
		   currentNumber = (currentNumber + ticks) % MaxNum;
		   //if current number equals second element in code array
		   if (currentNumber == secret2) {
			   //then num2 is true
			   num2 = true;
	   }
	   else {
		   //if it doesn't, num2 stays false
		   num2 = false;
	   }
	   }
   }
   /**
      Turns lock right given number of ticks
      @param ticks number of ticks to turn right
   */
   public void turnRight(int ticks)
   {
	   //FIRST RIGHT TURN
	   if (pos0) {
		   //changes value of currentNumber to: 40 - input
		   currentNumber = (MaxNum - ticks); 
		   //if the currentNumber equals the first element
	        if(currentNumber == secret1) {
	        	//moves on to the next turn
	         num1 = true; 
	         pos0 = false;
	     }
	   }
	     else {
	    	 //this code is only executed if its not the first right turn
	    	 //for example, if we have {2, 5, 39}, currrent number - ticks wouldbe less than 0,
	    	 //if it is not less than equal, then it equals the third element (given the correct input)
	       if(currentNumber - ticks > 0) {
	       num3 = true; 
	      }
	      else {
	    	  //in the example, 5 - ticks would be less than 0. 
	    	  //if this is the case, this code is executed
	          currentNumber = (MaxNum - (ticks - currentNumber)); 
	          num3 = false; 
	          if(currentNumber == secret3) {
	              num3 = true; 
	            }
	        }
	   }   
   }

   /**
      Returns true if the lock can be opened now
      @return true if lock is in open state
   */
   public boolean open()
   {
	   //if all three of these booleans are true,
	   //then the lock is opened, else, it's not..
	   if (num1) {
		   opened = true;
	   }
	   if (num2) {
		   opened = true;
	   }
	   if (num3) {
		   opened = true;
	   }
	   else {
		   opened = false;
	   }
      return opened; 
   }
   /**
   Returns current value dial is pointing at
   @return value dial is pointing at currently
    */
   public int getCurrentNumber() {
	   return currentNumber;
   }
}
