package Arrays;

public class LeaderInArray {
	// Naive solution
	// Time complexity = O(n^2)
	static void leader(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			boolean flag = false;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] <= arr[j]) {
					flag = true;
					break;
				}
			}
			if (flag == false)
				System.out.print(arr[i] + " ");

		}

	}

	// Efficient solution
	// Time complexity =O(n)
	// It prints the leader from the right side first
	static void leader1(int[] arr) {
		int curr_leader = arr[arr.length - 1];
		System.out.print(curr_leader + " ");
		for (int i = arr.length - 2; i >= 0; i--) {
			if (curr_leader < arr[i]) {
				curr_leader = arr[i];
				System.out.print(curr_leader + " ");
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 7, 10, 4, 10, 6, 5, 2 };
		// o/p = 10,6,5,2
		leader1(arr);
	}

}
