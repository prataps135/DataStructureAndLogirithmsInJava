package Arrays;

public class MaximumDifference {
	// We are finding maximum difference b/w j and i such that j > i
	// Time complexity = O(n^2)
	static int maxDiff(int[] arr) {
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int n = arr[j] - arr[i];
				if (max < n)
					max = n;
			}
		}
		return max;
	}

	// Efficient solution
	// This idea is all about finding mix and max and subject them
	// Time complexity = O(n)
	static int maxDiff1(int[] arr) {
		int max = arr[1] - arr[0];
		int minValue = arr[0];
		for (int j = 1; j < arr.length; j++) {
			max = max(max, arr[j] - minValue);
			minValue = min(minValue, arr[j]);
		}
		return max;
	}

	static int max(int a, int b) {
		if (a > b)
			return a;
		else
			return b;
	}

	static int min(int a, int b) {
		if (a < b)
			return a;
		else
			return b;
	}

	public static void main(String[] args) {
		int[] arr = { 2, 3, 10, 6, 4, 8, 1 }; // op = 8
		int[] arr1 = { 7, 9, 5, 6, 3, 2 }; // op = 2

		System.out.println(maxDiff(arr));
		System.out.println(maxDiff(arr1));
		System.out.println(maxDiff1(arr));
		System.out.println(maxDiff1(arr1));
	}

}
