package week1.day2;

public class IsPrimeNumber {
	public static void main(String[] args) {
		int number = 13;
		boolean isPrime = true;

		// 0 and 1 are not prime numbers
		if (number <= 1) {
			isPrime = false;
		} else {
            // Check if number is divisible by any number from 2 to number - 1
			for (int i = 2; i < number; i++) {
				if (number % i == 0) {
					// If it is divisible, then it's not a prime number
					isPrime = false;
					break;
				}
			}
		}

		if (isPrime) {
			System.out.println(number + " is a prime number.");
		} else {
			System.out.println(number + " is not a prime number.");
		}
	}
}

