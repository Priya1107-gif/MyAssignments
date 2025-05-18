package week3.day1;

public class FindDups {

	public static void main(String[] args) {
		int[] num={2, 5, 7, 9, 3};
		PrintDuplicates pd = new PrintDuplicates(); // Create object to access array
		int[] numbers = pd.num;

		System.out.println("Duplicate values:");
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < numbers.length; j++) {
				if (num[i] == numbers[j]) {
					System.out.println(numbers[i]);
					break;
				}

			}

		}
	}
}