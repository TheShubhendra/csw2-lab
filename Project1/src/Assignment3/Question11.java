package Assignment3;

import java.util.HashMap;
import java.util.Map;

public class Question11 {

	public static void main(String[] args) {
		int[] arr = {1, 4, 1, 5, 7, 8, 3, 5, 7, 3, 7, 3, 1, 9 , 8, 6, 5, 6, 5, 4, 10, 10, 4, 4, 3, 5, 6, 4 ,4 ,6 ,4};
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i: arr) {
			map.put(i, map.getOrDefault(i, 0)+1);
		}
		for(int i=1; i<=10; i++) {
			if(!map.containsKey(i))
				System.out.println(i + " is missing");
		}

	}

}
