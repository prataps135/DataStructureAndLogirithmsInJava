package Arrays;

public class SecondLargestElement {
	// Naive solution
	// Time complexity = O(n)
	static int getSecond(int[] arr) {
		int large = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > arr[large])
				large = i;
		}

		int second = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != arr[large]) {
				if (second == -1)
					second = i;
				else if (arr[i] > arr[second])
					second = i;
			}
		}
		return second;
	}

	// Efficient solution
	// Finding second largest in one traversal
	static int getSecond1(int[] arr) {
		int large = 0;
		int second = -1;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > arr[large]) {
				second = large;
				large = i;
			} else if (arr[i] != arr[large]) {
				if (second != -1 || arr[i] > arr[second])
					second = i;
			}
		}
		return second;
	}

	public static void main(String[] args) {
		int[] arr = { 10, 50, 20, 5, 100, 2, 6, 34, 52 };
		int[] arr1 = { 10, 10, 10 };
		System.out.println(getSecond(arr));
		System.out.println(getSecond(arr1));
		System.out.println(getSecond1(arr));
		System.out.println(getSecond1(arr1));
	}

}
