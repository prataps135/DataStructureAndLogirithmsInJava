package Arrays;

public class RemoveDuplicate {
	// Time complexity = O(n)
	// Auxiliary space = O(n)
	// Sorted array
	static int removeDuplicate(int[] arr) {
		int[] temp = new int[arr.length];
		temp[0] = arr[0];
		int res = 1;
		for (int i = 1; i < arr.length; i++) {
			if (temp[res - 1] != arr[i]) {
				temp[res] = arr[i];
				res++;
			}
		}
		for (int i : temp) {
			System.out.print(i + " ");
		}
		return res;
	}

	// Efficient solution
	// Time complexity = O(n)
	// Auxiliary space = O(1)
	static int removeDuplicate1(int[] arr) {
		int res = 1;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] != arr[res-1]) {
				arr[res] = arr[i];
				res++;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		int[] arr = { 10, 10, 20, 20, 20, 30, 30, 30 };
		int[] arr1 = { 10, 10, 10 };

		System.out.println(removeDuplicate(arr));
		System.out.println(removeDuplicate(arr1));
		System.out.println(removeDuplicate1(arr));
		System.out.println(removeDuplicate1(arr1));
	}

}
