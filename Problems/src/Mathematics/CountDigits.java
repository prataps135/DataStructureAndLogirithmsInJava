package Mathematics;

public class CountDigits {
	
	//time complexity = O(digit size)
	public static int function(int num) {
		int count = 0;
		while (num != 0) {
			num = num / 10;
			count++;
		}

		return count;

	}

	public static void main(String[] args) {
		System.out.println(function(12453));
	}

}
