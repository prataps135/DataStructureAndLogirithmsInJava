package Arrays;

//Vector is same as ArrayList. but vector is when we need synchronization
//It is legacy class
public class Vector {

	public static void main(String[] args) {
		java.util.Vector<Integer> v =new java.util.Vector();
		
		v.add(1);
		v.add(2);
		System.out.println(v);
	}

}
