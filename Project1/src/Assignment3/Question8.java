package Assignment3;

import java.util.*;
import java.util.Map;

public class Question8 {
	
	public static boolean areAnagrams(String s1, String s2) {
		Map<Character, Integer> map1 = new HashMap<Character, Integer>();
		Map<Character, Integer> map2 = new HashMap<Character, Integer>();
	
		for(char ch: s1.toCharArray()) {
			map1.put(ch, map1.getOrDefault(ch, 0) + 1);
		}
		
		for(char ch: s2.toCharArray()) {
			map2.put(ch, map2.getOrDefault(ch, 0) + 1);
		}
		
		if(!map1.keySet().equals(map2.keySet())) {
			return false;
		}
		

		for(char ch: map1.keySet()) {
			if(map1.get(ch)!=map2.get(ch)) {
				return false;
			}
		}
		
		return true;
		
	}

	public static void main(String[] args) {
			
		System.out.println(areAnagrams("listen", "silent"));
		

	}

}
