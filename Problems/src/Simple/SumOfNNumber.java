package Simple;

import java.util.Scanner;

public class SumOfNNumber {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number = ");
		n = sc.nextInt();

		System.out.println("sum = " + fun1(n));
		System.out.println("sum = " + fun2(n));
		System.out.println("sum = " + fun3(n));
	}

	static int fun1(int num) {
		return num * (num + 1) / 2;
	}

	static int fun2(int num) {
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum = sum + i;
		}
		return sum;
	}

	static int fun3(int num) {
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				sum++;
			}
		}
		return sum;
	}

}
