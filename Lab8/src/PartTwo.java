
public class PartTwo {
    // lab part 2

        //helper method
        public static int findSum (int[] input) {
            return computeAllValuesInArrayTwo(input, 0, 0);
        }

        //recursive method to calculate sum
        public static int computeAllValuesInArrayTwo (int[] input, int each , int total) {
            if (each == input.length) {
            	return total;
            }
            return computeAllValuesInArrayTwo(input, each + 1, total + input[each]);
        }
    }

