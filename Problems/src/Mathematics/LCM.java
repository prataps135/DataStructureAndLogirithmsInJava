package Mathematics;

public class LCM {
	static int fun(int a, int b) {
		int lcm = 0;
		int multi = a * b;
		for (int i = 1; i <= multi; i++) {
			if (i % a == 0 && i % b == 0) {
				lcm = i;
				break;
			}
		}
		return lcm;
	}

	static int fun1(int a, int b) {
		int result = Math.max(a, b);
		while (true) {
			if (result % a == 0 && result % b == 0) {
				return result;
			}
			result++;
		}
	}

	// Optimize solution
	// a*b = gcd(a,b) * lcm(a,b)
	// time complexity O(log(min(a,b))
	static int gcd(int a, int b) {
		if (b == 0) {
			return a;
		} else {
			return gcd(b, a % b);
		}
	}

	static int fun2(int a, int b) {
		return a * b / gcd(a, b);
	}

	public static void main(String[] args) {
		int a = 12;
		int b = 6;
		System.out.println(fun(a, b));
		System.out.println(fun1(a, b));
		System.out.println(fun2(a, b));
	}

}
