import java.util.ArrayList;

class Serial extends Circuit {

	//creating arraylist to hold values of resistors
	private ArrayList<Circuit> circuitList = new ArrayList<Circuit>();
	
	//overriding getResistance method to return sum of resistances
	public double getResistance() {
		//variable for sum
		double sum = 0;
		//advanced for loop with type: Circuit, to add each resistor in the arraylist
		for (Circuit numbers : circuitList) {
			sum = (sum + numbers.getResistance());
		}
		return sum;
	}
	
	//method to add circuit resistance 
	public void add(Circuit circuit) {
		circuitList.add(circuit);
	}
}