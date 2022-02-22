//subclass Resistor
class Resistor extends Circuit {
	//Creating resistance instance variable
	double resistance = 0;
	
	//Constructor to set local instance variable equal to local variable
	public Resistor (double resistance) {
		this.resistance = resistance;
	}
	
	//overriding getResistance method to return the resistance
	public double getResistance() {
		return resistance;
	}
}