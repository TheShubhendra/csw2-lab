package package1;

class Calculator{
	
	public static int add(int a, int b) {
		return a+b;
	}
	public static int sub(int a, int b) {
		return a-b;
	}
	public static int mult(int a, int b) {
		return a*b;
	}
}

public class Calc {
	public static void main(String[] args) {
		int a = 5;
		int b = 4;
		System.out.println(Calculator.add(a, b));
		
	}

}
