package Mathematics;

public class Factorial {
	// time complexity = O(n)
	public static int fact(int num) {
		if (num == 0 || num == 1) {
			return 1;
		} else {
			int fact = 1;
			for (int i = 1; i <= num; i++) {
				fact = fact * i;
			}
			return fact;
		}
	}

	public static int fact1(int num) {
		int fact = 1;
		for (int i = 2; i <= num; i++) {
			fact *= i;
		}
		return fact;
	}

	// recursive factorial function
	// time complexity = O(1)
	public static int fact2(int num) {
		if (num == 0) {
			return 1;
		}
		return num * fact2(num - 1);
	}

	public static void main(String[] args) {
		System.out.println(fact(1));
		System.out.println(fact(6));

		System.out.println(fact1(1));
		System.out.println(fact1(5));

		System.out.println(fact2(1));
		System.out.println(fact2(5));

	}

}
