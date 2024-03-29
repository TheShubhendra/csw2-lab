package assignment2;

import java.util.Objects;

class Student1<T extends Comparable<T>> implements Comparable<Student<T>> {
	private String name;
	private T roll;
	private int age;
	
	
	
	public Student1(String name, T roll, int age) {
		this.name = name;
		this.roll = roll;
		this.age = age;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(age, name, roll);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student<T> other = (Student<T>) obj;
		return age == other.age && Objects.equals(name, other.name) && Objects.equals(roll, other.roll);
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public T getRoll() {
		return roll;
	}
	public void setRoll(T roll) {
		this.roll = roll;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", roll=" + roll + ", age=" + age + "]";
	}

	
	@Override
	public int compareTo(Student<T> o) {
		if(this.equals(o)) {
			return 0;
		}
		return this.roll.compareTo(o.getRoll());
	}

	
	
}

public class Question1 {
		public static void main(String[] args) {
			
			Student<Integer> s1 = new Student<Integer>("A", 12, 23);
			Student<Integer> s2 = new Student<Integer>("A", 12, 23);
			System.out.println(s1);
			System.out.println(s2);
			System.out.println((s1.compareTo(s2)>0? s1: s2) + " Comes first");
			
	}
}