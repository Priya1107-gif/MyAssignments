package week3.day1;

import java.util.Arrays;

public class CheckAnagram {

	public static void main(String[] args) {
		 // Define the input strings
		String text1 = "schoolmaster", text2 = "theclassroom";
		 // Step 1: Check if the lengths are equal
		if(text1.length()!=text2.length())
		{
			System.out.println("Lengths mismatch, therefore the strings are not an Anagram");
			return;
		}
		  // Step 2: Convert strings to character arrays
		char[] charArray1 = text1.toCharArray();
		char[] charArray2 = text2.toCharArray();
		  // Step 3: Sort both character arrays
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		//print the sorted arrays
		System.out.println(charArray1);
		System.out.println(charArray2);
		 // Step 4: Compare sorted arrays
		if(Arrays.equals(charArray1, charArray2))
		{System.out.println("The given strings are Anagram.");
	}
		else {
			System.out.println("The given strings are not an Anagram.");
		}

}
}
