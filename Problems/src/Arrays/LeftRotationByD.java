package Arrays;

public class LeftRotationByD {
	// One left rotation
	static void oneLeft(int[] arr) {
		int temp = arr[0];
		for (int i = 1; i < arr.length; i++) {
			arr[i - 1] = arr[i];
		}
		arr[arr.length - 1] = temp;
	}

	static void dLeft1(int[] arr, int d) {
		for (int i = 1; i <= d; i++) {
			oneLeft(arr);
		}
	}

	// More efficient solution
	// Time complexity = O(n)
	static void dLeft2(int[] arr, int D) {
		int[] temp = new int[D];
		for (int i = 0; i < D; i++)
			temp[i] = arr[i];
		for (int i = D; i < arr.length; i++)
			arr[i - D] = arr[i];
		for (int i = 0; i < D; i++)
			arr[arr.length - D + i] = temp[i];
	}

	// Rotation algorithm
	// Time complexity = O(n)
	static void dLeft3(int[] arr, int d) {
		reverse(arr, 0, d - 1);
		reverse(arr, d, arr.length - 1);
		reverse(arr, 0, arr.length - 1);
	}

	static void reverse(int[] arr, int low, int high) {
		while (low < high) {
			int temp = arr[low];
			arr[low] = arr[high];
			arr[high] = temp;
			low++;
			high--;
		}
	}

	// Array rotation by value D
	// Time complexity = O(n*D)
	static void dLeft(int[] arr, int D) {
		for (int k = 1; k <= D; k++) {
			for (int i = 0; i < arr.length - 1; i++) {
				int temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;

			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		dLeft3(arr, 2);
		System.out.println();
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

}
