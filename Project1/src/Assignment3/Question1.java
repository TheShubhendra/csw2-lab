package Assignment3;

import java.util.Arrays;


class Pair<K,V>{
	private K key;
	private V value;
	
	public Pair(K key, V value) {
		this.key = key;
		this.value = value;
	}
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return key.toString() + " : " + value.toString();
	}
	
	
}

public class Question1 {
	public static void main(String[] args) {
	Pair<Integer, String> p1 = new Pair<Integer, String>(37 , "Shubhendra");
	Pair<Character, Integer> p2 = new Pair<Character, Integer>('B' , 2);
	
	System.out.println(p1.toString());
	System.out.println(p2.toString());
	}
}
