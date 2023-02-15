package Mathematics;

public class GcdUsingEuclideanAlgorithm {

	// Euclidean Algorithm
	static int fun(int a, int b) {
		while (a != b) {
			if (a > b) {
				a = a - b;
			} else {
				b = b - a;
			}
		}
		return a;
	}

	// Optimized
	static int fun1(int a, int b) {
		if (b == 0) {
			return a;
		} else {
			return fun1(b, a % b);
		}
	}

	public static void main(String[] args) {
		int a = 25;
		int b = 125;
		System.out.println(fun(a, b));
		System.out.println(fun1(a, b));

	}

}
