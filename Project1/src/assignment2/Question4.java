package assignment2;

import java.util.Objects;

class Student implements Comparable<Student>{
	private String name;
	private int rn;
	private float totalMark;
	public Student(String name, int rn, float totalMark) {
		this.name = name;
		this.rn = rn;
		this.totalMark = totalMark;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", rn=" + rn + ", totalMark=" + totalMark + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, rn, totalMark);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return  rn == other.rn;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRn() {
		return rn;
	}
	public void setRn(int rn) {
		this.rn = rn;
	}
	public float getTotalMark() {
		return totalMark;
	}
	public void setTotalMark(float totalMark) {
		this.totalMark = totalMark;
	}

	@Override
	public int compareTo(Student o) {
	    if(this.rn==o.getRn()) {
	    	return 0;
	    }else if(this.rn<o.getRn()) {
	    	return -1;
	    }else {
	    	return 1;
	    }
	}

	
	
	
}

public class Question4 {

	public static void main(String[] args) {
		Student[] students = new Student[5];
		students[0] = new Student("Shubhendra", 37, 100.f);
		students[1] = new Student("Abhigyan", 40, 100.f);
		students[2] = new Student("Vishal", 36, 101.11f);
		students[3] = new Student("Soumyadeep", 23, 102.2f);
		students[4] = new Student("Someone", 66, 0.8f);
		
		Student key = students[0];
		
		for(Student student: students) {
			if(student.equals(key)) {
				System.out.println("Found " + student);
				break;
			}
		}
		
		
	}
	
}

