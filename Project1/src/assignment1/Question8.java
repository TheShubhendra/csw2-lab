package assignment1;

interface Vehicle{
	public void accelerate(double speed, double duration);
	public void accelerate(double speed);
	public void brake();
}


class Owner{
	String name;
	int yob;
	Vehicle v1;
	Vehicle v2;
	
	public Vehicle getV2() {
		return v2;
	}
	public void setV2(Vehicle v2) {
		this.v2 = v2;
	}
	public Owner(String name, int yob) {

		this.name = name;
		this.yob = yob;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYob() {
		return yob;
	}
	public void setYob(int yob) {
		this.yob = yob;
	}
	public Vehicle getV1() {
		return v1;
	}
	public void setV1(Vehicle v) {
		this.v1 = v;
	}
	
	
}

class Car implements Vehicle{

	@Override
	public void accelerate(double speed, double duration) {
		System.out.println("Acceleratee!!!!");
		
	}
	@Override
	public void accelerate(double speed) {
		System.out.println("Acceleratee!!!!");
		
	}


	@Override
	public void brake() {
		System.out.println("Breakkkk!!!");
		
	}
	
}

class Bicycle implements Vehicle{

	@Override
	public void accelerate(double speed, double duration) {
		System.out.println("Accelerating");
		
	}
	@Override
	public void accelerate(double speed) {
		System.out.println("Acceleratee!!!!");
		
	}


	@Override
	public void brake() {
		System.out.println("Brake");
		
	}
	
	
}


public class Question8 {

	public static void main(String[] args) {
		
		Vehicle car = new Car();
		Vehicle b = new Bicycle();
		car.accelerate(1.4, 4.5);
		car.brake();
		
		b.accelerate(9.5, 3.4);
		b.brake();
		
		Owner o = new Owner("Shubh", 2002);
		o.setV1(car);
		o.setV2(b);
		
		
		
	}

}
