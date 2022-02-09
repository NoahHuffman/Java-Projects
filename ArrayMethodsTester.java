import java.util.Arrays;
import java.util.Random;


public class ArrayMethodsTester {

	//helper method to print an array
	public static void printArray(int[] values) {
		System.out.println(Arrays.toString(values));
	}
	public static void main(String[] args) {

		//In your main method you should test your array methods
		//Create an array of size 10
		//****** HERE
		final int SIZE = 11;
		int[] a = new int[SIZE]; //array of size 1
		
		//**** Fill the array with random values (use a loop, and a
		//Random object)
		for (int i =0; i < a.length; i++) {
		a[i] = (int)(Math.random()*(100-0+1));
		}
		//Now print the array to show initial values
		System.out.println("Initial Array:");
		//note the usage of the "toString()" method here to print the array
		System.out.println(Arrays.toString(a));
		//Could replace the previous line with this:
		//printArray(testValues);
		//blank line
		System.out.println();


		//Test methods below this line.

		//Test of removeMiddle()
		System.out.println("Before call to removeMiddle():");
		printArray(a);
		//swap first and last element
		//this method modifies the array referenced by "testValues"
		ArrayMethods.removeMiddle(a);
		System.out.println("After call to removeMiddle()");
		printArray(a); //printing the same array but it has changed
		System.out.println();


		//Test of swapFirstAndLast()
		System.out.println("Before call to swapFirstAndLast():");
		printArray(a);
		//swap first and last element
		//this method modifies the array referenced by "testValues"
		ArrayMethods.swapFirstAndLast(a);
		System.out.println("After call to swapFirstAndLast()");
		printArray(a); //printing the same array but it has changed
		System.out.println();

		//continue with tests as you complete methods ...
		
		
				//Test of shiftRight()
				System.out.println("Before call to shiftRight():");
				printArray(a);
				//swap first and last element
				//this method modifies the array referenced by "testValues"
				ArrayMethods.shiftRight(a);
				System.out.println("After call to shiftRight()");
				printArray(a); //printing the same array but it has changed
				System.out.println();

		
				//Test of largerOfAdjacents()
				System.out.println("Before call to largerOfAdjacents():");
				printArray(a);
				//swap first and last element
				//this method modifies the array referenced by "testValues"
				ArrayMethods.largerOfAdjacents(a);
				System.out.println("After call to largerOfAdjacents()");
				printArray(a); //printing the same array but it has changed
				System.out.println();

				
				//Test of moveEvensToFront()
				System.out.println("Before call to moveEvensToFront():");
				printArray(a);
				//swap first and last element
				//this method modifies the array referenced by "testValues"
				ArrayMethods.moveEvensToFront(a);
				System.out.println("After call to moveEvensToFront()");
				printArray(a); //printing the same array but it has changed
				System.out.println();
	
				
				//Test of isSorted()
				System.out.println("Before call to isSorted():");
				printArray(a);
				//swap first and last element
				//this method modifies the array referenced by "testValues"
	//			System.out.println(ArrayMethods.isSorted(a));
				System.out.println("After call to isSorted()");
	//			printArray(a); //printing the same array but it has changed
				System.out.println(ArrayMethods.isSorted(a));
				System.out.println();	
				
				
				//Test of hasAdjDuplicates()
				System.out.println("Before call to hasAdjDuplicates():");
				printArray(a);
				//swap first and last element
				//this method modifies the array referenced by "testValues"
		//		ArrayMethods.hasAdjDuplicates(a);
				System.out.println("After call to hasAdjDuplicates()");
				System.out.println(ArrayMethods.hasAdjDuplicates(a));
		//		printArray(a); //printing the same array but it has changed
				System.out.println();
				
				
				//Test of ret2ndLargest()
				System.out.println("Before call to ret2ndLargest():");
				printArray(a);
				//swap first and last element
				//this method modifies the array referenced by "testValues"
		//		ArrayMethods.ret2ndLargest(a);
				System.out.println("After call to ret2ndLargest()");
				System.out.println(ArrayMethods.ret2ndLargest(a));
		//		printArray(a); //printing the same array but it has changed
				System.out.println();

				
				//Test of hasDuplicates()
				System.out.println("Before call to hasDuplicates():");
				printArray(a);
				//swap first and last element
				//this method modifies the array referenced by "testValues"
		//		ArrayMethods.hasAdjDuplicates(a);
				System.out.println("After call to hasDuplicates()");
				System.out.println(ArrayMethods.hasDuplicates(a));
		//		printArray(a); //printing the same array but it has changed
				System.out.println();

				

				
				
				//Test of setEvensToZero()
				System.out.println("Before call to setEvensToZero():");
				printArray(a);
				//swap first and last element
				//this method modifies the array referenced by "testValues"
				ArrayMethods.setEvensToZero(a);
				System.out.println("After call to setEvensToZero()");
				printArray(a); //printing the same array but it has changed
				System.out.println();
				
				


	}

}
