package Arrays;

public class FixedSizeArray {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// Array always store in heap memory
		/*
		 * two types of array 1.Fixed size 2.Dynamic size
		 */
		int[] arr = new int[10];
		int n = 10;
		int[] arr1 = new int[n];
		int[] arr2 = { 1, 2, 3, 4 };
		System.out.println(arr2);
	}

}
