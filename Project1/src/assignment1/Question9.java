package assignment1;

import java.util.*;

class Student {
    private int id;
    private String name;
    private List<Course> courses;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

	public List<Course> getCourses() {
		return courses;
	}

	public void addCourse(Course course) {
		this.courses.add(course);
	}
	
	public boolean removeCourse(Course course) {
		return this.courses.remove(course);
	}

	
	public void display() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
    }

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
	
}


class Course implements EnrollmentSystem{

    private String code;
    private String name;
    private List<Student> students;


    @Override
	public String toString() {
		return "Course [code=" + code + ", name=" + name + "]";
	}

	public Course(String code, String name) {
        this.code = code;
        this.name = name;
        this.students = new ArrayList<Student>();
    }

    public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
	public List<Student> getStudents() {
		return students;
	}

	public void addStudent(Student student) {
		this.students.add(student);
	}
	
	public boolean removeStudent(Student student) {
		return this.students.remove(student);
	}

	public void display() {
        System.out.println("Course Code: " + code);
        System.out.println("Course Name: " + name);
    }

	@Override
	public void enroll(Student student) {
		this.students.add(student);
		
	}

	@Override
	public void drop(Student student) {
		this.students.remove(student);
		
	}

	@Override
	public void displayEnrollment() {
		System.out.println("Enrollments in course: "+this.name);
		for(Student s: this.students) {
			System.out.println(s);
		}
		
	}
}


interface EnrollmentSystem {

    public void enroll(Student student);

    public void drop(Student student);

    public void displayEnrollment();
}


class Enrollment {
	
	public Course course;
	public Student student;
	
	public static List<Enrollment> enrollments = new ArrayList<>();
	
	Enrollment(Course course, Student student){
		this.course = course;
		this.student = student;
	}
	
	
	public static void enroll(Student student, Course course) {
		enrollments.add(new Enrollment(course, student));
		course.enroll(student);
		System.out.println("Enrollment Created");
		
	}

	public static void drop(Student student, Course course) {
		if(enrollments.remove(new Enrollment(course, student))) {
			course.drop(student);
			System.out.println("Enrollment Dropeed");
		}else {
			System.out.println("Enrollment does not exist");
		}
		
		
	}

	@Override
	public String toString() {
		return "Enrollment [course=" + course + ", student=" + student + "]";
	}

	public static void displayEnrollmentDetails() {
		for(Enrollment e: enrollments) {
			System.out.println(e);
		}
		
	}


	@Override
	public int hashCode() {
		return Objects.hash(course, student);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Enrollment other = (Enrollment) obj;
		return Objects.equals(course, other.course) && Objects.equals(student, other.student);
	}
	
	
}

public class Question9 {
    public static void main(String[] args) {

        Student s1 = new Student(1001, "a");
        Student s2 = new Student(1002, "b");
        Student s3 = new Student(1003, "c");

        Course c1 = new Course("CS101", "Introduction to Computer Science");
        Course c2 = new Course("CS102", "Data Structures and Algorithms");
        Course c3 = new Course("CS103", "Object-Oriented Programming");

        


        Enrollment.enroll(s1, c1);
        Enrollment.enroll(s2, c1);
        Enrollment.enroll(s3, c1);
        Enrollment.enroll(s1, c2);
        Enrollment.enroll(s2, c2);
        Enrollment.enroll(s3, c3);

        Enrollment.displayEnrollmentDetails();

        Enrollment.drop(s1, c1);
        Enrollment.drop(s2, c2);
        Enrollment.drop(s3, c3);
        Enrollment.drop(s3, c2);


        Enrollment.displayEnrollmentDetails();
    }

}

/*

- The program follows the principles of loose coupling and high cohesion by separating the concerns of different classes and ensuring that each class has a single responsibility.
- The `Student` class is responsible for representing a student and maintaining the list of enrolled courses for each student.
- The `Course` class is responsible for representing a course.
- The `Enrollment` class is responsible for managing the enrollment of students in courses and storing the enrollment details in.
- The `EnrollmentSystem` interface defines the methods for enrollment management and allows the `Enrollment` class to interact with the other classes indirectly through the interface.
- The `Question9` class is responsible for demonstrating the system's functionality by creating some students and courses, and calling the methods of the `Enrollment` class.
- The program uses appropriate error handling and user-friendly output messages.
*/
