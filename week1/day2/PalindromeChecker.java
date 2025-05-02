package week1.day2;

public class PalindromeChecker {
	public static void main(String[] args) {
		int input = 1223221; // You can change this value to test other inputs
		int originalInput = input; // Store original number
		int output = 0;

		// Reversing the digits using a for loop
		for (; input != 0; input = input / 10) {
			int digit = input % 10;
			output = output * 10 + digit;
		}

		// Checking if the original input and reversed output are the same
		if (originalInput == output) {
			System.out.println(originalInput+"- is a Palindrome");
		} else {
			System.out.println(originalInput+"- is not a Palindrome");
		}
	}

}
