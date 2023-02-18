package Arrays;

public class LeftRotation {
	// Time complexity = O(n)
	static void left(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int temp = arr[i];
			arr[i] = arr[i + 1];
			arr[i + 1] = temp;

		}
	}

	// Naive solution
	static void left1(int[] arr) {
		int temp = arr[0];
		for (int i = 1; i < arr.length; i++) {
			arr[i - 1] = arr[i];
		}
		arr[arr.length - 1] = temp;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		left(arr);
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

}
