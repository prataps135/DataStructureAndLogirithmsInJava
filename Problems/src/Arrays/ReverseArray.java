package Arrays;

public class ReverseArray {
//	static void reverse(int[] arr) {
//		int k = arr.length - 1;
//		for (int i = 0; i < arr.length; i++) {
//			int num = arr[k];
//			for (int j = arr.length - 1; j > 0; j--) {
//				arr[j] = arr[j - 1];
//			}
//			arr[i] = num;
//			k--;
//		}
//	}

	// We swap the low and high
	static void reverse(int[] arr) {
		int low = 0, high = arr.length - 1;
		while (low < high) {
			int temp = arr[high];
			arr[high] = arr[low];
			arr[low] = temp;
			low++;
			high--;
		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };

		reverse(arr);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
