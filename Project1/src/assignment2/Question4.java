package assignment2;

class Student1<T extends Number & Comparable<Student>> implements Comparable<Student1<T>>{
	private String name;
	private int rn;
	private T totalMark;
	public Student1(String name, int rn, T totalMark) {
		super();
		this.name = name;
		this.rn = rn;
		this.totalMark = totalMark;
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
	public T getTotalMark() {
		return totalMark;
	}
	public void setTotalMark(T totalMark) {
		this.totalMark = totalMark;
	}

	@Override
	public int compareTo(Student1<T> o) {
	    return this.totalMark.compareTo(o.getTotalMark());
	}

	
	
	
	
}

public class Question4 {
	Student1<Integer>[] students = new Student1<Integer>[5];
	
	
	
	
}
