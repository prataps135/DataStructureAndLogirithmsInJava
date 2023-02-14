
public class ArrayOfObject {
	public static void main(String[] args) {
		// array declaration and initialization
		Student[] students;
		students = new Student[5];

		// creating object of student class
		Student s1 = new Student(10, "Sunil");
		Student s2 = new Student(11, "Aman");
		Student s3 = new Student(12, "Vineeta");
		Student s4 = new Student(13, "Vipin");
		Student s5 = new Student(14, "Naman");

		// putting value in an array using constructor to the class
		students[0] = s1;
		students[1] = s2;
		students[2] = s3;
		students[3] = s4;
		students[4] = s5;

		// printing the values
		for (int i = 0; i < students.length; i++) {
			System.out.println("ID = " + students[i].id + " Name = " + students[i].name);
		}
	}
}
