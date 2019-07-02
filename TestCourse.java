

public class TestCourse {

	public static void main(String[] args) {
		Course c1 = new Course("CS 1302");
		c1.addStudent("Bob");
		c1.addStudent("Joe");
		System.out.println("C1: " + c1.getCourseName() + ", " + c1.getNumberOfStudents());
		Course c1Clone = (Course)c1.clone();
		System.out.println("C1's Clone: " + c1Clone.getCourseName() + ", " + c1Clone.getNumberOfStudents());
		
		System.out.println();
		
		Course c2 = new Course("ENGL 1102");
		c2.addStudent("Tim");
		c2.addStudent("Tom");
		c2.addStudent("Tot");
		System.out.println("C2: " + c2.getCourseName() + ", " + c2.getNumberOfStudents());
		Course c2Clone = (Course)c2.clone();
		System.out.println("C2's Clone: " + c2Clone.getCourseName() + ", " + c2Clone.getNumberOfStudents());

	}

}
