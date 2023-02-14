package Mathematics;

public class Palindrome {
	// time complexity = O(digits of number)
	public static boolean fun(int num) {
		int newNum = 0;
		int temp;
		int check = num;
		while (num > 0) {
			temp = num % 10;
			num = num / 10;
			newNum = (newNum * 10) + temp;
		}
		if (newNum == check) {
			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) {
		System.out.println(fun(12321));
		System.out.println(fun(123456));

	}

}
