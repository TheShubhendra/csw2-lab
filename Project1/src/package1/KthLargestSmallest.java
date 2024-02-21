package package1;

import java.util.Arrays;

public class KthLargestSmallest {

	public static void main(String[] args) {
		int[] arr = {4, 76, 3, 2, 5, 3, 57, 7};
		int k = 2;
		Arrays.sort(arr);
		System.out.println("Kth smallest: "+ arr[k-1]);
		System.out.println("Kth largest: "+ arr[arr.length-k]);
	}

}
