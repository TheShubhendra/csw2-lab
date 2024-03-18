package Assignment3;
import java.util.*;

public class Question6 {

	public static void main(String[] args) {
		Set<Integer> set = new TreeSet<Integer>();
		set.add(2);
		set.add(74);
		set.add(9);
		set.add(34);
		System.out.println(set);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to search: ");
		int x = sc.nextInt();
		System.out.println(x + " is " + (set.contains(x)? "": "not ") + "present");
		set.remove(9);
		sc.close();
	}

}
