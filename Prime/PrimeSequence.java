package Prime;

//Class to generate prime numbers
public class PrimeSequence implements Sequence {
	//Creating variable for first prime, because 1 != prime
	int n = 2;
	@Override
	//method
	public int next() {
		//n cannot be 2, so this sets it equal to 1
		if(n == 2) {
			n=1;
			return 2;				
			}
		//any number that is divisible by 2 (is a even number) is not a prime number
        do { 
        	n += 2; 
        	} 
        while (!isPrime(n)); 
        return n;
	}
	//method to calculate whether number is prime or not
	//@return boolean
	//@param int n
	boolean isPrime(int n) {
		for ( int i = 3; i < n; i++) {
			//if the number is divisible by i, it won't be a prime, so return false
			if (n%i==0) {
				return false;
			}
			
		}
		//else our number is a prime
		return true;
	}
	

}
