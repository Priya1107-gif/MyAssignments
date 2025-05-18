package week3.day1;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		 // Given input string
		String text = "We learn Java basics as part of java sessions in java week1";
		 // Step 1: Split the text into an array of words using space as the delimiter
		String[] words = text.split(" ");
		 // Step 2: Initialize the 'count' variable to track duplicates
		int count = 0;
		 // Step 3: Compare each word with every other word to find duplicates
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                // Step 4: Check if words are equal ignoring case
                if (words[i].equalsIgnoreCase(words[j]) && !words[i].equals("")) {
                    // Replace the duplicate word with an empty string
                    words[j] = "";
                    count++; // Increment count of duplicates found
                }
            }
        }

        // Step 5: If count > 0, print the modified array without duplicates
        StringBuilder modifiedText = new StringBuilder();
        for (String word : words) {
            if (!word.equals("")) {
                modifiedText.append(word).append(" "); // Append non-empty words
            }
        }
        
        // Step 6: Print the modified text (removing trailing space)
        System.out.println(modifiedText.toString().trim());
    }
}
