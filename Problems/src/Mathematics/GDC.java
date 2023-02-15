package Mathematics;

public class GDC {
	//time complexity = O(max(a,b))
	static int fun(int a, int b) {
		int gcd = 1;
		int big = Math.max(a, b);
//		if (a > b) {
//			big = a;
//		} else {
//			big = b;
//		}

		for (int i = 1; i <= big; i++) {
			if ((a % i == 0) && (b % i == 0)) {
				gcd = i;
			}
		}

		return gcd;
	}
	
	//time complexity = O(min(a,b))
	static int fun1(int a, int b) {
		int result = Math.min(a, b);
		while (result > 0) {
			if ((a % result == 0) && (b % result == 0)) {
				break;
			}
			result--;
		}
		return result;

	}

	public static void main(String[] args) {
		int a = 25;
		int b = 125;
		System.out.println(fun(a, b));
		System.out.println(fun1(a, b));
	}

}
