import java.util.ArrayList;

class Parallel extends Circuit {

	//creating arraylist to hold values of resistors
	private ArrayList<Circuit> circuitList = new ArrayList<Circuit>();
	
	//overriding getResistance method to compute sum of all combined resistors
	public double getResistance() {
		//creating variable to hold the sum
		double sum = 0;
		//for loop with type: Circuit, to add each resistor in the arraylist
		for (Circuit numbers : circuitList) {
			sum = sum + (1 / numbers.getResistance());
		}
		return 1/sum;
	}
	
	//method to add circuit resistance
	public void add(Circuit circuit) {
		circuitList.add(circuit);
	}
}