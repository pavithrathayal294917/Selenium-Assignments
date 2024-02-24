package Week3;

import java.util.Arrays;

public class PrintSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {3, 2, 11, 4, 6, 7};
		Arrays.sort(arr);
		int len=arr.length;
		System.out.println("The second largest number is: " + arr[len-2]);

	}

}
