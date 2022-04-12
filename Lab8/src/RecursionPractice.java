import java.util.Scanner;

public class RecursionPractice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //creating array
        int[] numbers = new int[] {1,3,5,9};
        //prompting the user
        System.out.println("Guess the sum of the elements in the array");
        //getting their input
        double input = in.nextDouble();
        //calling sqrtGuess
        System.out.println("The square root of your input is " + PartOne.sqrtGuess(input));

        in.close();
        //calling findSum method
        int result = PartTwo.findSum(numbers);
        System.out.println("The sum of the elements in the array is: " + result);

    }
}

   