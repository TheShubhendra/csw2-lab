package package1;

import java.util.ArrayList;
import java.util.List;

class InvalidStudentExceptionUnhecked extends RuntimeException{

	InvalidStudentExceptionUnhecked(String message, Throwable cause){
		super(message, cause);
	}
}




class Student{
	int roll;
	String name;
	int age;
	public Student(int roll, String name, int age) {
		this.roll = roll;
		this.name = name;
		this.age = age;
	}
	
}

public class Lecture {
	private int classId;
	private String subj;
	private String roomNo;
	List<Student> students;
	
	
	
	public Lecture(int classId, String subj, String roomNo) {
		super();
		this.classId = classId;
		this.subj = subj;
		this.roomNo = roomNo;
		
		this.students = new ArrayList<Student>();
	}

	public static void main(String[] args){
		 Lecture l1 = new Lecture(1,"CSW" , "501");
		 l1.addStudent(null);
	}
	
	public void addStudent(Student s){
		if(s==null) {
			throw new InvalidStudentExceptionUnhecked("Student is Null", new NullPointerException("Null pointer"));
		}
		students.add(s);
		
	}
}
