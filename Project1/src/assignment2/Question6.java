package assignment2;

import java.util.Objects;

class Animal{
	private String name;
	private String color;
	private String type;
	public Animal(String name, String color, String type) {
		super();
		this.name = name;
		this.color = color;
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Animal [name=" + name + ", color=" + color + ", type=" + type + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(color, name, type);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		return Objects.equals(color, other.color) && Objects.equals(name, other.name)
				&& Objects.equals(type, other.type);
	}
	
}

public class Question6 {

	public static void main(String[] args) {
		Animal a1 = new Animal("Pillu", "pet", "black");
		Animal a2 = new Animal("Billu", "pet", "grey");
		Animal a3 = new Animal("Kallo", "pet", "red");
		Animal a4 = new Animal("Pillu", "pet", "black");
		Animal a5 = new Animal("Sheru", "wild", "brown");
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
		System.out.println(a3.hashCode());
		System.out.println(a4.hashCode());
		System.out.println(a5.hashCode());

	}

}
