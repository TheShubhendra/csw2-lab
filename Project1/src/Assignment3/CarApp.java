package Assignment3;

import java.util.ArrayList;
import java.util.List;

class Car implements Comparable<Car>{
	private int modelNo;
	private String name;
	private int stock;
	public Car(int modelNo, String name, int stock) {
		this.modelNo = modelNo;
		this.name = name;
		this.stock = stock;
	}
	public int getModelNo() {
		return modelNo;
	}
	public void setModelNo(int modelNo) {
		this.modelNo = modelNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	@Override
	public String toString() {
		return modelNo + " " + name + " " + stock + "\n";
	}
	@Override
	public int compareTo(Car o) {
		return this.stock == o.getStock() ? 0: this.stock>o.getStock()? 1: -1;
	}
	
	
}

public class CarApp {

	
	
	public static void main(String[] args) {
		List<Car> list = new ArrayList<Car>();
		
		list.add(new Car(1996, "Ford Model T", 16));
		list.add(new Car(2001, "Lada \"Classic\"", 32));
		list.add(new Car(2004, "Volkswagen Gol", 32));
		list.add(new Car(2006, "Hindustan Ambassador", 23));
		System.out.println(list);
		list.sort(null);
		System.out.println(list);
		
	
	}

}
