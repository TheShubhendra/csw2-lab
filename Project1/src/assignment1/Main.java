package assignment1;

class Laptop{
	private String model;
	private float price;
	
	
	public String getModel() {
		return model;
	}
	public void setModel(String mode) {
		this.model = mode;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	
	@Override
	public String toString() {
		return "Laptop [mode=" + model + ", price=" + price + "]";
	}
	
}

public class Main {

	public static void main(String[] args) {
		Laptop l = new Laptop();
		l.setModel("Apple");
		l.setPrice(350000.3f);
		System.out.println(l);

	}

}

/* 
 * toString method returns the string representation of that object. it may contain properties of the instance.
 * In the laptop class we are overriding toString method so that it prints model and prices of the laptop instance.
 * When we print the laptop instance in the Main class. it implicitly calls the toString method of the Laptop class.
 * 
 */