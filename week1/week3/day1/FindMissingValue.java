package week3.day1;

import java.util.Arrays;

public class FindMissingValue {

	public static void main(String[] args) {
		int[] Input = {1, 4,3,2,8, 6, 7};// Input array with a missing number
		 // Step 1: Sort the array
		Arrays.sort(Input);
		//printing sorted array
		for (int i = 0; i < Input.length; i++) {
			System.out.println(Input[i]);
		}
		 // Step 2: Loop through the array from arr[0] to arr[arr.length - 1]
		for (int j = Input[0]; j < Input[Input.length-1]; j++)	
		if(j!=Input[j-Input[0]]) {
			System.out.println("Missing element = "+ j);
		break;
		}

	}

}
