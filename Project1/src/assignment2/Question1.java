package assignment2;

import java.util.Objects;

class Student<T>{
	private String name;
	private T roll;
	private int age;
	
	
	
	public Student(String name, T roll, int age) {
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
	
	
}

public class Question1 {
		public static void main(String[] args) {
			
			Student<Integer> s1 = new Student<>("A", 12, 23);
			Student<String> s2 = new Student<>("A", "13", 23);
			System.out.println(s1);
			System.out.println(s2);
			
	}
}
