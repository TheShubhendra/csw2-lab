package Assignment3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


class User implements Comparable<User>{
	private String name;
	private int age;
	public User(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public int compareTo(User o) {
		if(this.age == o.age) {
			return 0;
		}else if(this.age > o.age){
			return 1;
		}else {
			return -1;
		}
	}
	@Override
	public String toString() {
		return name + " Age: "+ age;
	}
	
	
	
}


public class ArrayListUser{

	public static void bubbleSort(List<User> list) {
		for(int i=0; i<list.size(); i++) {
			for(int j=0; j<list.size()-i-1; j++) {
				if(list.get(j).getAge() > list.get(j+1).getAge()) {
					User temp = list.get(j);
					list.set(j, list.get(j+1));
					list.set(j+1, temp);
				}
			}
		}
	}
	public static void main(String[] args){
	    List<User> list = new ArrayList<User>();
		list.add(new User("Shubhendra", 22));
		list.add(new User("Not Shubhendra", 75));
		list.add(new User("Nobody", 0));
		System.out.println(list);
		bubbleSort(list);
		System.out.println(list);
		
	}
	
}

