public class Simple1DArray {
    /**
     * @param args
     */
    public static void main(String[] args) {
        int[] arr; //Array declaration
        arr = new int[5];	//Memory allocation to array
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Elements at "+ i+" "+arr[i]);
        }
        
        int[] arr1 = {1,2,3,4,5}; 	//Array literals

        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Elements at "+ i+" "+arr1[i]);
        }
    }
}