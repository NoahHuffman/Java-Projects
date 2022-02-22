/**
 * A class to run tests on the Circuit class and subclasses
 * @author Horstman
 * @version 02/06/2014
 *  
 */

public class CircuitDemo
{	/**
	method that implements tests for Circuit class and subclasses
	@param args - Not Used.
 	*/
	
   public static void main(String[] args)
   {	   
	   //constructors Parallel and Serial
      Parallel circuit1 = new Parallel();
      Serial circuit2 = new Serial();
      //Adding elements to the ArrayList
      circuit1.add(new Resistor(100));
      circuit2.add(new Resistor(100));
      circuit2.add(new Resistor(200));
      circuit1.add(circuit2);
      //printing the combined resistance
      System.out.println("Combined resistance: " + circuit1.getResistance());
      System.out.println("Expected: 75.0");
   }
}

