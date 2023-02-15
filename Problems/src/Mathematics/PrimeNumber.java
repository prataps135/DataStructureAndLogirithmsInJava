package Mathematics;

public class PrimeNumber {
	// time complexity = O(n)
	static boolean prime(int a) {
		boolean result = true;
		if (a <= 1) {
			result = false;
		} else {
			for (int i = 2; i < a; i++) {
				if (a % i == 0) {
					result = false;
				}
			}
		}
		return result;
	}

	// Optimize solution
	// find from 2 to Square root of n
	// time complexity = O(square root of n)
	static boolean prime1(int a) {
		if (a <= 1) {
			return false;
		}

		for (int i = 2; i * i <= a; i++) {
			if (a % i == 0) {
				return false;
			}
		}
		return true;
	}

	// More optimize
	// checking the number is divisible by 2 and 3
	// time complexity = O(1/3 * square root of n)
	static boolean prime2(int a) {
		if (a == 1)
			return true;
		if (a == 2 || a == 3)
			return true;
		if (a % 2 == 0 || a % 3 == 0)
			return false;
		for (int i = 5; i * i <= a; i = i + 6) {
			if (a % i == 0 || a % (i + 2) == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int a = 3;
		int b = 10;

		System.out.println(prime(a));
		System.out.println(prime(b));
		System.out.println(prime(2));

		System.out.println(prime1(a));
		System.out.println(prime1(b));
		System.out.println(prime1(2));

		System.out.println(prime2(a));
		System.out.println(prime2(b));
		System.out.println(prime2(121));
	}

}
