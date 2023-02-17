package Arrays;

public class LargestElement {
	// Return largest and its index
	// Time complexity = O(n)
	static int[] largest(int[] arr, int sizeOfArray) {
		int max = arr[0];
		int index = 0;
		for (int i = 0; i < sizeOfArray; i++) {
			if (max < arr[i])
				max = arr[i];
		}
		for (int i = 0; i < sizeOfArray; i++) {
			if (max == arr[i]) {
				index = i;
				break;
			}
		}
		int[] nArr = new int[2];
		nArr[0] = max;
		nArr[1] = index;
		return nArr;
	}

	// Naive approach
	// Time Complexity = O(n^2)
	// In this we check every one element with the remaining ones
	static int getLargest(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			boolean flag = true;
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] > arr[i]) {
					flag = false;
					break;
				}
			}
			if (flag == true)
				return i;
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { 10, 20, 5, 100 };
		int[] nArr = largest(arr, 4);
		System.out.println("Max = " + nArr[0] + " at index " + nArr[1]);
		System.out.println(getLargest(arr));
	}

}
