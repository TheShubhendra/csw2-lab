package assignment1;

class Rectangle{
	private double length;
	private double width;
	
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}
	
	public double area() {
		return this.length  * this.width;
	}
	
	public double perimeter(){
		return 2 * ( this.length + this.width) ;
	}
	
	
	
}

public class Question2 {

	public static void main(String[] args) {
		Rectangle rect = new Rectangle(12.5, 2);
		System.out.println("Area: " + rect.area());
		System.out.println("Perimeter: " + rect.perimeter());
		
		

	}

}
