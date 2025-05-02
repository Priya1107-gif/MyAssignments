package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		int range = 8;
		int first = 0;
		int second = 1;

		System.out.println("Fibonacci series up to " + range + " numbers:");

		// Print the Fibonacci series
		for (int i = 0; i < range; i++) {
			System.out.print(first + " ");

			// Calculate the next number
			int next = first + second;

			// Update first and second values
			first = second;
			second = next;
		}

	}

}
