package week3.day1;

public class ChangeOddIndexToUppercase {

	public static void main(String[] args) {
		// Given input string
		String test = "changeme";

		// Step 1: Convert the String to a character array
		char[] charArray = test.toCharArray();

		// Step 2: Implement a loop to iterate through each character of the String from end to start
		for (int i = charArray.length - 1; i >= 0; i--) {
			// Step 3: Check if the index is odd
			if (i % 2 != 0) {
				// Step 4: Change the character to uppercase if the index is odd
				charArray[i] = Character.toUpperCase(charArray[i]);
			}
		}

		// Step 5: Print the characters after modification
		System.out.println(new String(charArray));  // Output: cHaNgEmE
	}

}
