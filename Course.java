

public class Course implements Cloneable{
	private String courseName;
	private String[] students = new String[100];
	private int numberOfStudents;
	
	public Course(String courseName) {
		this.courseName = courseName;
	}
	
	public void addStudent(String student) {
		students[numberOfStudents] = student;
		numberOfStudents++;
	}
	
	public String[] getStudents() {
		return students;
	}
	
	public int getNumberOfStudents() {
		return numberOfStudents;
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	public Object clone() {
		Course c1 = new Course(this.courseName);
		c1.students = this.students;
		c1.numberOfStudents = this.numberOfStudents;
		return c1;
		
	}
	
}