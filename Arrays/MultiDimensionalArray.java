
public class MultiDimensionalArray {

	public static void main(String[] args) {
	
//		int arr[][] = new int[3][3];
		//declaration of 3*3 array
		int arr[][] = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		//printing the values
		for(int i = 0; i < 3;i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		

	}

}
