//Completed: A, B, C, D, E, F, G, H, I, J


import java.util.Scanner;

import java.util.Arrays;
import java.util.Random;


public class ArrayMethods {

	//***NOTE that these methods will change the array itself
//A///////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////

	//part a, fill in this method
	public static void swapFirstAndLast(int[] values) {
		// save the first element to a temp var
		int temp = values[0];
		//move the last element to the first position
		values[0] = values[values.length-1];
		// now put the saved first element into the last position
		values[values.length-1] = temp;


	}

//B///////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////

	//part b, fill in this method
	public static void shiftRight(int[] values) {
		//setting temp to equal last index
		int temp = values[values.length-1];
		for (int i = values.length-1; i>0; i--) {
			values[i] = values[i-1];
		}
		//after the loop stops, and elements [0] and [1] are equal:
		values[0] = temp;
	}

//C///////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////

	//part c, set all even elements to 0.
	public static void setEvensToZero(int[] values) {
		//creating for loop and if/else statements to test whether an
		//element is even or odd
		for (int i = 0; i < values.length; i++) {
			//prints a zero if the element is even
			if(values[i] % 2 == 0) {
				values[i] = 0;
			}
			
		}
	}

//D///////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////

	//part d, replace each element except the first and last by larger of two 
	//around it
	public static void largerOfAdjacents(int[] values) {
		//recreate an empty array
		int[] temp = new int[values.length];
		//first and last elements are the same
		temp[0] = values[0];
		temp[values.length-1] = values[values.length-1];
		
		for(int i = 1; i < values.length-1; i++) {
			//if element left element greater than right element, 
			//set i equal to it
			if(values[i-1] > values[i+1]) {
				temp[i] = values[i-1];
			}
			else {
				//if it is not greater than, set it equal to 
				//right element
				temp[i] = values[i+1];
			}
		}
			for(int i = 0; i < values.length; i++) {
				values[i] = temp[i];
			
		}
	}

//E///////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////

	//part e, remove middle el if odd length, else remove middle two els.
	public static int[] removeMiddle(int[] values) {
		int index = 0;
		for (int i = index; i < values.length-1; i++) {
			//if array length is odd AND i >= the middle element
			if (values.length % 2 != 0 && i >= values.length/2) {
				//index equals the middle element
				index = (values.length / 2) + 1;
				//each element starting with the middle, is equal
				//to the element to its right
				values[i] = values[i + 1];
			}
		}
			for (int i = index; i < values.length-2; i++) {
			//if array length is even AND i >= middle left element
			 if (values.length % 2 == 0 && i >= (values.length/2)-1) {
				//index equals middle left element of array
				index = values.length / 2;
				//each element starting with the middle left, is equal
				//to element two spaces to the right
				values[i] = values[i + 2];
			}
		}
		return null;
	}
	
	

//F///////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////

	//part f - move all evens to front
	public static void moveEvensToFront(int[] values) {
			
		 	int temp=0;
		    int a=0;
		    for(int i=0;i<values.length;i++){
		    	//if the element is even
		        if(values[i] % 2 == 0){
		        		
		            for (int j=i;j>a;j--){
		                temp = values[j-1];
		                values[j-1] = values[j];
		                values[j] = temp;
		            }
		            a++;
		        }
		    }
	}

//G///////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////

	//part g - return second largest element in array
	public static int ret2ndLargest(int[] values) {
		//sorting the array
		Arrays.sort(values);
		//find the second largest element
		//Starting at the end of the array and decrementing down
		//to make sure that the largest element index[9] is not
		//the same as the indexes below it.
		for (int i = values.length-1; i < values.length; i--) {
			if (values[i] != values[i-1]) {
				return values[i-1];
			}			
		}
		return 0; 
	}

//H///////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////

	//part H - returns true if array is sorted in increasing order 
	public static boolean isSorted(int[] values) {
		//sorts the array, I just did this to 
		//make sure it would return true if sorted
//		Arrays.sort(values);
		for (int i = 0; i < values.length-1; i++) {
			//if element is greater than its right neighbor, return false
			if (values[i] > values[i + 1]) {
				return false;
			}
		}
		
		return true; 
		
	}

//I///////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////

	//PART I - return true if array contains 2 adjacent duplicate values

	public static boolean hasAdjDuplicates(int[] values) {
		for (int i = 1; i < values.length-1; i++) {
			//if element is equal to its right or left neighbor, return true
			if (values[i] == values[i-1] || values[i] == values[i+1]) {
				return true;
			}
		}
		
		return false; 
	}

//J///////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////

	//PART J - return true if array contains 2 duplicate values

	public static boolean hasDuplicates(int[] values) {
		for (int i = 0; i < values.length; i++) { 
			//setting j to equal its right neighbor
			for (int j = i + 1 ; j < values.length; j++) {
				//if element i equals element j (its right neighbor) return true
				if(values[i] == values[j]) {
					return true;
				}
			}
		}
		return false; 
	}
}



// { 1, 2, 3, 4, 5, 6, 7, 8}
//{1, 2, 3, 4, 5}
//Get the length.
//If the length is odd, index equals middle element. 
//If the length is even, index equals middle two elements.
//Starting with the index and working right, each element equals
//the element to its right.
//Next, remove the last index or last two indexes




//Part E
//Scanner in = new Scanner(System.in);
//int currentSize = 0;
//while (in.hasNextInt()) {
//	if (currentSize < values.length) {
//		values[currentSize] = in.nextInt();  
//		currentSize++;
//	}
//}
//This section gives a value to index based on 
//whether the array length is even or odd
//	int index = 0;
//	if (values.length % 2 == 0 ) {
//	    index = values.length / 2;
//	} else {
//	    index = (values.length / 2) + 1;
//	}
//
//	for (int i = index; i < values.length-1; i++) {				
//		values[i] = values[i + 1];
//	}
//decrements the size to remove empty index
//currentSize--;
//this line needed to compile
//	return null;

