package Arrays;

public class SortedCheck {
	// Only checking ascending order
	// Time complexity = O(n)
	static boolean isSorted(int[] arr) {
		int element = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < element)
				return false;
			element = arr[i];
		}
		return true;
	}

	// Naive solution
	// Time complexity = O(n^2)
	static boolean isSorted1(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if (arr[j] < arr[i])
					return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// sorted array
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 7, 7, 8, 9 };
		// unsorted array
		int[] arr1 = { 10, 20, 30, 15, 14 };

		System.out.println(isSorted(arr));
		System.out.println(isSorted(arr1));
		
		System.out.println(isSorted1(arr));
		System.out.println(isSorted1(arr1));
	}

}
