import java.util.*;

/**
 * Creating Class to generate substrings of values inside an arraylist
 */
public class SubstringGenerator {
	/**
	 * Method to find substrings
	 * @param word the word being used
	 * @return the arraylist with the substrings
	 */
	public static ArrayList<String> getSubstrings(String word) {
		ArrayList<String> result = substrings(new ArrayList<String>(), 0, word.length(), word);
		//Creating constant empty string value
		result.add("");
		Collections.reverse(result); 
		return result;
	}
	
	/**
	 * Recursive method to find the substrings
	 * @param strings the array to fill
	 * @param currentIndex the beginning and current index
	 * @param lastIndex the last index
	 * @param word the word being used
	 * @return the arraylist with the substrings
	 */
		private static ArrayList<String> substrings(ArrayList<String> strings, int currentIndex, int lastIndex, String word) {
			if (currentIndex == word.length())
				return strings;
			if (currentIndex == lastIndex)
				return substrings(strings, currentIndex += 1, word.length(), word);
			strings.add(word.substring(currentIndex, lastIndex));
			return substrings(strings, currentIndex, lastIndex -= 1, word);
		}
	}


