package Arrays;

public class ArrayInsertion {
	// Time complexity = O(n)
	static int insert(int arr[], int n, int x, int cap, int pos) {
		if (n == cap)
			return n;
		int idx = pos - 1;
		for (int i = n - 1; i >= idx; i--) {
			arr[i + 1] = arr[i];
		}
		arr[idx] = x;
		return (n + 1);
	}

	public static void main(String[] args) {
		int[] arr = new int[5];
		arr[0] = 5;
		arr[1] = 10;
		arr[2] = 20;
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		// if we want to insert 3 at position 2
		System.out.println(insert(arr, 3, 3, 5, 2));
		// and then we want to insert 7 at position 2
		System.out.println(insert(arr, 4, 7, 5, 2));
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
