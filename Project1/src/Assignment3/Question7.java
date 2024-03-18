package Assignment3;

import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

class Address implements Comparable<Address>{
	int plotNo;
	String at;
	String post;
	
	
	
	public Address(int plotNo, String at, String post) {
		this.plotNo = plotNo;
		this.at = at;
		this.post = post;
	}


	

	@Override
	public int hashCode() {
		return Objects.hash(at, plotNo, post);
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Address other = (Address) obj;
		return Objects.equals(at, other.at) && plotNo == other.plotNo && Objects.equals(post, other.post);
	}




	@Override
	public int compareTo(Address o) {
		if(this.equals(o)) {
			return 0;
		}else {
			return this.plotNo - o.plotNo;
		}
	}
}


public class Question7 {

	public static void main(String[] args) {
		Map<String, Address>  map = new TreeMap<String, Address>();
		map.put("Shubh", new Address(501, "Central Library", "ITER"));

	}

}
