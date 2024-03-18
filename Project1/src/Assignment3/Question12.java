package Assignment3;

import java.util.PriorityQueue;

public class Question12 {

	public static void main(String[] args) {
		int[] arr = {1,2,10,8,7,3,4,6,5,9};
		
		PriorityQueue<Integer> q = new PriorityQueue<Integer>();
		for(int i: arr) {
			q.add(i);
		}
		
		while(!q.isEmpty()) {
			System.out.println(q.poll());
		}

	}

}
