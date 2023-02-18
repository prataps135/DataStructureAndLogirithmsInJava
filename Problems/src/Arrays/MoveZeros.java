package Arrays;

public class MoveZeros {
	// Time complexity = O(n^2)
	static void zeros(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] == 0) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	// Naive solution
	// Time Complexity = O(n^2)
	// In this we are swapping a zero element with a non zero
	static void zeros1(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[j] != 0) {
						int temp = arr[j];
						arr[j] = arr[i];
						arr[i] = temp;
					}
				}
			}
		}
	}

	// Efficient solution
	// Time complexity = O(n)
	static void zeros2(int[]arr) {
		int count=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]!=0) {
				int temp = arr[count];
				arr[count] = arr[i];
				arr[i] = temp;
				count++;
			}
		}
	}
	
	// Swapping function to swap any two integer values
//	static void swap(int a, int b) {
//		int temp = a;
//		a = b;
//		b = temp;
//	}

	public static void main(String[] args) {
		int[] arr = { 8, 5, 0, 10, 0, 20 };
		int[] arr1 = { 0, 0, 0, 10, 20 };
		zeros2(arr);
		zeros2(arr1);
		for (int x : arr) {
			System.out.print(x + " ");
		}
		System.out.println();
		for (int x : arr1) {
			System.out.print(x + " ");
		}
	}

}
