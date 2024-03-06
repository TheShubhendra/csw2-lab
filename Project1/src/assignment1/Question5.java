package assignment1;

class College{
	private String collegeName;
	private String collegeLoc;
	
	
	public College(String collegeName, String collegeLoc) {
		this.collegeName = collegeName;
		this.collegeLoc = collegeLoc;
	}


	public String getCollegeName() {
		return collegeName;
	}


	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}


	public String getCollegeLoc() {
		return collegeLoc;
	}


	public void setCollegeLoc(String collegeLoc) {
		this.collegeLoc = collegeLoc;
	}


	@Override
	public String toString() {
		return "College [collegeName=" + collegeName + ", collegeLoc=" + collegeLoc + "]";
	}
	
	
	
}

class Student1{
	private int studentId;
	private String studentName;
	private College college;
	
	
	public Student1(int studentId, String studentName, College college) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.college = college;
	}


	public int getStudentId() {
		return studentId;
	}


	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}


	public String getStudentName() {
		return studentName;
	}


	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}


	public College getCollege() {
		return college;
	}


	public void setCollege(College college) {
		this.college = college;
	}
	
	
	public void displayStudentInfo() {
		System.out.println("Name: "+ this.studentName + "\nID: "+ this.studentId + "\nCollege name: "+ this.college.getCollegeName() + "\nCollege Location: "+ this.college.getCollegeLoc());
	}
	
}

public class Question5 {

	public static void main(String[] args) {
		College c1 = new College("ITER", "Jagamara");
		College c2 = new College("KIT", "Patia");
		
		System.out.println(c1);
		System.out.println(c2);
		
		
		Student1 s1 = new Student1(1232, "Student 1", c1);
		Student1 s2 = new Student1(12312, "Student 2", c2);
		
		
		s1.displayStudentInfo();
		s2.displayStudentInfo();
		

	}

}
