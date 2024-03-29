package assignment2;

import java.util.Objects;

class Car  implements Comparable<Car>{
	private String model;
	private String color;
	private int speed;
	
	
	public Car(String model, String color, int speed) {
		this.model = model;
		this.color = color;
		this.speed = speed;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public int getSpeed() {
		return speed;
	}


	public void setSpeed(int speed) {
		this.speed = speed;
	}


	@Override
	public int hashCode() {
		return Objects.hash(color, model, speed);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		return Objects.equals(color, other.color) && Objects.equals(model, other.model) && speed == other.speed;
	}


	@Override
	public String toString() {
		return "Car [model=" + model + ", color=" + color + ", speed=" + speed + "]";
	}


	@Override
	public int compareTo(Car o) {
		return this.equals(o)?0:this.speed>o.speed?1:-1;
//		if (this.equals(o)) {
//			return 0;
//		}else if(this.speed>o.getSpeed()) {
//			return 1;
//		}else {
//			return -1;
//		}
	}
	
}

public class Question3 {

	public static void main(String[] args) {
		Car c1 = new Car("Mazda Furai", "Matte black", 335);
		Car c2 = new Car("Ferrari 296", "Red", 330);
		System.out.println((c1.compareTo(c2) > 0 ?c1:c2 ) + " is faster");

	}

}
