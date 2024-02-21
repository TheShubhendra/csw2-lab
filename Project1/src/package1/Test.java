package package1;


 class Employee{
	String name;
	int id;
	public void setValue(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public void display() {
		System.out.println("ID: "+ this.id + " Name: "+ this.name);
	}
}

public class Test {

	public static void main(String[] args) {
		Employee e = new Employee();
		e.setValue(76, "xyz");
		e.display();

	}

}
