package Arrays.searching;

public class LinearSearch {
	// Time complexity = O(n)
	// Unsorted Array
	static int search(int arr[], int n, int x) {
		for (int i = 0; i < n; i++) {
			if (arr[i] == x) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		System.out.println(search(arr, 5, 10));
	}

}
