package assignment2;

import java.util.Arrays;

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
		return "Student [name=" + name + ", rn=" + rn + ", totalMark=" + totalMark + "]\n";
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

public class Question5 {
	public static void bubbleSort(Student[] arr) {
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length-i-1; j++) {
				if(arr[j].compareTo(arr[j+1])>0) {
					Student temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Student[] students = new Student[5];
		
		students[0] = new Student("Shubhendra", 37, 100.f);
		students[1] = new Student("Abhigyan", 40, 100.f);
		students[2] = new Student("Vishal", 36, 101.11f);
		students[3] = new Student("Soumyadeep", 23, 102.2f);
		students[4] = new Student("Someone", 66, 0.8f);
		
		System.out.println("Before Sort");
		System.out.println(Arrays.toString(students));
		bubbleSort(students);
		System.out.println("After Sort");
		System.out.println(Arrays.toString(students));
		
		
	}
	
}
