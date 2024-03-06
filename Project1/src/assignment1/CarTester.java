package assignment1;

class Carr{
	private int make;
	private String model;
	
	
	public Carr() {
		this.make = 0;
		this.model = null;
	}
	
	public Carr(int make, String model) {
		this.make = make;
		this.model = model;
	}
	public int getMake() {
		return make;
	}
	public void setMake(int make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "Car [make=" + make + ", model=" + model + "]";
	}
	

}




public class CarTester {

	public static void main(String[] args) {
		Carr c1 = new Carr(1990, "Z1");
		Carr c2 = new Carr();
		System.out.println(c1);
		System.out.println(c2);
		c2.setMake(343);
		c2.setModel("Ferrary");
		System.out.println(c2);

	}

}
