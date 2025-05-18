package week3.day1;

public class ReverseOddPositionWords {

	public static void main(String[] args) {
		 // Input string
        String test = "I am a software tester";
        
        // Step 1: Split the string into an array of words
        String[] words = test.split(" ");  // This splits the string by spaces into words
        
        // Step 2: Variable to store the result (output string)
        String result = "";
        
        // Step 3: Loop through the array of words
        for (int i = 0; i < words.length; i++) {
            // Check if the current word is at an odd index
            if (i % 2 != 0) {  // Odd index (1, 3, 5, etc.)
                // Reverse the word at the odd index
                String word = words[i];
                String reversedWord = "";
                
                // Reverse the current word letter by letter
                for (int j = word.length() - 1; j >= 0; j--) {
                    reversedWord += word.charAt(j);  // Add each character in reverse order
                }
                
                // Add the reversed word to the result string with a space
                result += reversedWord + " ";
            } else {
                // Add the even-indexed word as it is
                result += words[i] + " ";
            }
        }
        
        // Step 4: Remove the extra space at the end of the result string
        result = result.trim();
        
        // Step 5: Print the final result
        System.out.println(result);
    }
}
