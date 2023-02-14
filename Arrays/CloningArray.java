
public class CloningArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		int[][] arr1 = {{1,2,3}, {3,4}};
		
		
		int[] arrClone = arr.clone();	//Deep copy only in 1D Array
		int[] arrClone1 = arr;			//reference copy
		
		int[][] arrCloneMulti = arr1.clone();	//Shallow copy in multi dimensional Array
		
		
		System.out.println(arr == arrClone);
		System.out.println(arr == arrClone1);
		
		System.out.println(arr1 == arrCloneMulti);
		System.out.println(arr1[0] == arrCloneMulti[0]);
		System.out.println(arr1[1] == arrCloneMulti[1]);
		
	}

}
