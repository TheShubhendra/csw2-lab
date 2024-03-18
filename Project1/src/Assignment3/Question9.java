package Assignment3;

import java.util.HashSet;
import java.util.Set;

public class Question9 {

	public static void main(String[] args) {
		int[] arr = {4, 2, 4, 2, 5, 22, 5, 2 , 2, 5, 32, 2,3};
		Set<Integer> s = new HashSet<Integer>();
		for(int i: arr) {
			if(!s.add(i)) {
				System.out.println(i + " is repeated");
			}
		}
	}

}
