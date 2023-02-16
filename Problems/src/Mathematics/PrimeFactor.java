package Mathematics;

public class PrimeFactor {
	static boolean isPrime(int n) {
		if (n == 1)
			return false;
		for (int i = 2; i < n; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}
	
	//time complexity O(n log n)
	static void primeFactor(int n) {
		for (int i = 2; i < n; i++) {
			if (isPrime(i)) {
				int x = i;
				while (n % x == 0) {
					System.out.print(" " + i);
					x = x * i;
				}
			}
		}
	}
	
	//Optimal solution

	public static void main(String[] args) {
		primeFactor(100);
	}

}
