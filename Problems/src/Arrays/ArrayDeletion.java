package Arrays;

public class ArrayDeletion {
	static int deletion(int[] arr, int n, int x) {
		int pos = search(arr, n, x);
		for (int i = pos; i < n - 1; i++) {
			arr[i] = arr[i + 1];
		}
		return 1;
	}

	static int search(int[] arr, int n, int x) {
		for (int i = 0; i < n; i++) {
			if (arr[i] == x)
				return i;
		}
		return -1;
	}

	// More efficient way
	// Time complexity = O(n)
	static int del(int[] arr, int n, int x) {
		int i;
		for (i = 0; i < n; i++) {
			if (arr[i] == x)
				break;
		}
		if (i == n)
			return n;
		for (int j = i; j < n - 1; j++) {
			arr[j] = arr[j + 1];
		}
		return (n - 1);
	}

	public static void main(String[] args) {
		int[] arr = { 12, 4, 14, 2, 1 };

		// we want to delete 4 and reduce the array
		deletion(arr, 5, 4);
		del(arr, 5, 14);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
