
public class PartOne {
        //helper method
        public static double sqrtGuess (double x) {
            if (x < 1) {
            	return 0.0;
            }
            return sqrtGuessTwo(x, x);
        }

        //recursive method to calculate squareroot
        private static double sqrtGuessTwo (double x, double g) {
            if (Math.abs(x - (g * g)) < 0.001) {
            	return g;
            }
            return sqrtGuessTwo(x, (g + (x / g)) / 2);
        }
    }

