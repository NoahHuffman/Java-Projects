//Lab2
import java.util.Scanner;
public class TheaterSeatSeller {
	//constants for the size of the theater
	static final int NUM_ROWS = 9;
	static final int NUM_COLS = 10;
	//array that tracks how many tickets of each price that are still
	//available. loc[0] is $10, loc[1] is $20, ..., loc[4] is $50
	//this variable must be initialized inside of the constructor
	int[] pricesAvailable = {0,0,0,0,0}; //5 ticket prices, 10,20,30,40,50
	//ticket prices, a value of 0 will represent a seat that
	//has been sold
	int[][] seats = 
		{	{10, 10, 10, 10, 10, 10, 10, 10, 10, 10},
			{10, 10, 10, 10, 10, 10, 10, 10, 10, 10},
			{10, 10, 10, 10, 10, 10, 10, 10, 10, 10},
			{10, 10, 20, 20, 20, 20, 20, 20, 10, 10},
			{10, 10, 20, 20, 20, 20, 20, 20, 10, 10},
			{10, 10, 20, 20, 20, 20, 20, 20, 10, 10},
			{20, 20, 30, 30, 40, 40, 30, 30, 20, 20},
			{20, 30, 30, 40, 50, 50, 40, 30, 30, 20},
			{30, 40, 50, 50, 50, 50, 50, 50, 40, 30}	};
	
	//************************constructor  You must fill this in!
	public TheaterSeatSeller() {
		//Nested for loop with following conditions:
		for (int i=0; i < seats.length; i++) {
			for (int j=0; j < seats[0].length; j++) {
				//if the element at index seats[i][j] equals the amount
					if (seats[i][j] == 10) {
						//increment the corresponding element in pricesAvailable[]
						pricesAvailable[0]++;
				    }
					if (seats[i][j] == 20) {
						pricesAvailable[1]++;
					}
					if (seats[i][j] == 30) {
						pricesAvailable[2]++;
					}
					if (seats[i][j] == 40) {
						pricesAvailable[3]++;
					}
					if (seats[i][j] == 50) {
						pricesAvailable[4]++;
					}
				
			}
		}
		//****************HERE You must set the pricesAvailable[] array.
		//hint: Iterate over the seats[][] array
		//if the value in the seats array is 10, increment pricesAvailable[0];
		//if the value in seats[][] is 20, increment pricesAvailable[1]; ... etc
		//I do NOT want you to simply count by hand the number of each ticket 
		//in the seats array.  You need to loop through the seats array with
		//nested for loops, and update the pricesAvailable array 
	}
	
	//a method to print the current seats array
	//a 0 represents an empty seat
	//******************You must insert code into this method in order to 
	//***********Also print the number of available tickets at each price
	public void printSeats() {
		
		//blank line
		System.out.println();
		//print spacer
		System.out.print("     ");
		//print column headings
		for(int i = 0; i<NUM_COLS; i++) {
			System.out.printf("%5s", "[" + i + "]");
		}
		System.out.println(); //blank line
		//iterate over rows
		for (int i = 0; i< NUM_ROWS; i++) {
			//print row heading
			System.out.printf("%5s", "[" + i + "]");
			//iterate over columns
			for(int j = 0; j<NUM_COLS; j++) {
				System.out.printf("%5d", seats[i][j]);
			}
			System.out.println(); //blank line
			System.out.println();
		}
		System.out.println("The available ticket prices are:");
		//prints the available prices for each indivudual index
		System.out.printf("%5s", "$10 : " + pricesAvailable[0]);
		//prints blank line
		System.out.println();
		System.out.printf("%5s", "$20 : " + pricesAvailable[1]);
		System.out.println();
		System.out.printf("%5s", "$30 : " + pricesAvailable[2]);
		System.out.println();
		System.out.printf("%5s", "$40 : " + pricesAvailable[3]);
		System.out.println();
		System.out.printf("%5s", "$50 : " + pricesAvailable[4]);
		System.out.println();
	}
	//method to search the array for the first element equal to parameter price
	//return true if a seat is found, otherwise return false
	//replace the found seat with a value of 0 to indicate that it is no longer
	//for sale
	//don't forget that you must also update the pricesAvailable[] array when
	//you successfully sell a seat
	public boolean getByPrice(int price) {
		System.out.println("You chose to buy a ticket with price: $" + price);
		//************YOUR SOLUTION GOES HERE************//
		//Nested for loop with the following conditions:
		for (int i=0; i < seats.length; i++) {
			for (int j=0; j < seats[0].length; j++) {
				//if the element at index seats[i][j] equals the alotted price,
				if (seats[i][j] == price) {
					//set the element equal to 0
					seats[i][j] = 0;
					return true;
				}
			}
			}
		
		return false; //return value
	}
	//Method to sell a ticket based on the location given by parameters row,col
	//Method returns true if the seat is available, and sets that seat location to
	//0 to indicate the seat is no longer available.
	//This method should also check that parameters row, col are within
	//the valid range of indices for the seats[][] array
	//otherwise the method returns false to indicate the specified seat was not 
	//available
	//don't forget that you must also update the pricesAvailable[] array when
	//you successfully sell a seat
	public boolean getByLoc(int row, int col) {
		System.out.println("You chose row: " + row + ", col: " + col);
		//************YOUR SOLUTION GOES HERE************//
				//if the element at index seats[row][col] doesn't equal 0:
				if (seats[row][col] != 0) {
					//decrements element at given pricesAvailable index
					//if element at seats[row][col] = $30, then 
					//		30 / 10 - 1 = 2 => pricesAvailable[2]
					pricesAvailable[(seats[row][col])/10-1]--; 
					//set it equal to 0
					seats[row][col] = 0;
					return true;
				}	
				
		return false; //return value
	}
	
///////Don't edit

	//Method that runs our seat selling simulation.  You do NOT need to modify this
	//method.  However, you should make sure you understand this method.
	//In future assignments you will have to create menu options similar to this.
	public void start() { //initiates the simulation
		boolean running = true;
		
		//TheaterSeatSeller mySeller = new TheaterSeatSeller();
		String userInput = "";
		Scanner myScanner = new Scanner(System.in);
		//initial test to print the initial seating chart
		printSeats();
	
		System.out.println(); //blank line
		System.out.println("Purchase by (P)rice or (L)ocation, P(R)INT, (Q)uit");
		
		while(running) {//main execution loop
			userInput = myScanner.next(); //get input
			//set menu options here
			//1) quit
			if(userInput.charAt(0) == 'Q' || userInput.charAt(0) == 'q') {
				System.out.println("Ta-Ta for now!!!");
				break; 
			} else if(userInput.charAt(0)=='P' || userInput.charAt(0) == 'p') {
				
				System.out.println("You chose option: Price");
				System.out.print("Enter Price (10,20,30,40,50):");
				int price =0;
				userInput = myScanner.next();
				System.out.println();
				if(userInput.equals("10")||userInput.equals("20")||userInput.equals("30")
						||userInput.equals("40")||userInput.equals("50")) {
					price = Integer.parseInt(userInput);
					if(getByPrice(price)) {
						System.out.println("Congratulations, you purchased a ticket for $"+price);
					} else {
						System.out.println("Sorry, no more tickets available for this price");
					}
				} else {//bad input
					System.out.println("Invalid Entry.");
				}
					
				
			} else if(userInput.charAt(0)=='L' || userInput.charAt(0) == 'l') {
				
				System.out.println("You chose option: Location");
				System.out.println("Enter Row and Column separated by a space:");
				int row = -1;
				int col = -1; //holds location
				if(myScanner.hasNextInt()) {
					row = myScanner.nextInt();
					if(myScanner.hasNextInt()) {
						col = myScanner.nextInt();
						if (getByLoc(row, col)) {
							System.out.println("Congratulations, you purchased a ticket for at: "
												+row+", " + col);
						} else {
							System.out.println("Sorry, no ticket available at this location.");
						}
					} else { //invalid, not an int
						System.out.println("Invalid Entry, use Integer");
						//flush input
						userInput = myScanner.next();
					}
				} else {
					System.out.println("Invalid Entry, use Integer");
					//flush input
					userInput = myScanner.next();
				}
				
			} else if(userInput.charAt(0)=='R' || userInput.charAt(0) == 'r') {
				printSeats();
			} else {//error
				System.out.println("Error, please choose P, L or Q");
			}
			//blank line before next prompt
			System.out.println();
			//prompt for next input
			System.out.println("Purchase by (P)rice or (L)ocation, P(R)INT, (Q)uit");
		}
		myScanner.close(); //close resource when done.
	}
	
/////////Don't edit	

	public static void main(String[] args) {
		//create a new TheaterSeatSeller Object to run simulation
		TheaterSeatSeller mySeller = new TheaterSeatSeller();
		//start simulation
		mySeller.start();	
		}
	}