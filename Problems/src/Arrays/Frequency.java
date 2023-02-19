package Arrays;

public class Frequency {
//	static void frequency(int[] arr) {
//		for (int i = 0; i < arr.length; i++) {
//			int count = 1;
//			int element = arr[i];
//			for (int j = i; j < arr.length; j++) {
//				if (element == arr[j])
//					count++;
//			}
//			System.out.println("Element " + arr[i] + " occurs " + count + " times.");
//		}
//	}

	static void frequency(int[] arr) {
		int freq = 1, i = 1;
		int n = arr.length;
		while (i < n) {
			while (i < n && arr[i] == arr[i - 1]) {
				freq++;
				i++;
			}
			System.out.println("Element " + arr[i - 1] + " occurs " + freq + " times.");
		}
		if (n == 1 || arr[n - 1] != arr[n - 2]) {
			System.out.println("Element " + arr[n - 1] + " occurs " + freq + " times.");
		}
	}

	public static void main(String[] args) {
		int[] arr = { 10, 10, 10, 20, 20, 30 };
		frequency(arr);

	}

}
