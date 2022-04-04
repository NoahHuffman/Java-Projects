import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.Math;

public class CapacitorVoltage {	

	//declaring variables so I can use them throughout code
	private static double B;
	private static double R;
	private static double C;
	private static double T1;
	private static double T2;

	public static void main(String[] args) throws FileNotFoundException {
		
		try {
			File inputFile = new File("params.txt");
			Scanner in = new Scanner(inputFile);
			
			//Setting variables equal to the values inside the input file
			B = in.nextDouble();
			R = in.nextDouble();
			C = in.nextDouble();
			T1 = in.nextDouble();
			T2 = in.nextDouble();
			
			//declaring t variable
			double t = 0;

			//printing initial value 0.0
			System.out.println(t + "	0.0");
		
			
			//declaring printwriter 
			PrintWriter out = new PrintWriter("rc.txt");
			//skip counting by 10 to get values of t
			while (t <= 990) {
				
				t += 10;
				
				//Creating variable that implements the equation, and prints the result
				double answer = (double) B * (1 - (Math.pow(2.71828, (-0.008*t))));
				
				
				
				//printing succeeding values
				out.println(t + "	" + answer);
				System.out.println(t + "	" + answer);
				
				
				
				
			}
			
			out.close();
			
			//loop to process values inside the text file
			while (in.hasNextDouble()) {
				double value = in.nextDouble();
				System.out.println(value);
				
			}
			
	
			//constructing printWriter object to write an output file
		//	PrintWriter out = new PrintWriter("rc.txt");
			
			//Sending info to output file
		//	out.println("yo");
			
			//closing files
			in.close();
		//	out.close();
		}	
		catch (FileNotFoundException ex) {
			System.out.println("File not found! Please try again later.");
		}

			
			

			System.out.println();
			System.out.println("yo");
		

	}

}



/**
 * 
 * V = B*(1-(2.71828^))
 * 
 * (e^-0.008t)  ------->   B * (1 - (Math.pow(2.71828, (-0.008*T2))))
 * 
 */










