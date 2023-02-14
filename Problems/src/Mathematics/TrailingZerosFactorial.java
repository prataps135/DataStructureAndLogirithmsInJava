package Mathematics;

public class TrailingZerosFactorial {
	// time complexity = O(n)
	public static int fact(int num) {
		int result = 1;
		for (int i = 2; i <= num; i++) {
			result = result * i;
		}
		return result;
	}

	public static int zeros(int num) {
		int result = 0;
		while (num > 0) {
			int temp = num % 10;
			num = num / 10;
			if (temp == 0) {
				result++;
			}
		}
		return result;
	}
	
	//more efficient way to find big factorial
	// time complexity = O(log n)
	public static int countingZeros(int num) {
		int result = 0;
		for (int i = 5; i <= num; i = i * 5) {
			result = result + num/i;
		}
		return result;
	}

	public static void main(String[] args) {
		int a = fact(10);
		System.out.println(zeros(a));
		
		System.out.println(countingZeros(15));

	}

}
