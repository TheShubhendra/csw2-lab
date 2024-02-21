package package1;

public class MoveZero {

	public static void main(String[] args) {
		int [] arr = {0,1,0,3, 0,0, 53, 3, 43, 0};
		int k=0;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]!=0) {
				arr[k++] = arr[i];
			}
		}
		while(k<arr.length) {
			arr[k++]=0;
		}

		
		for(int i: arr) {
			System.out.print(i+ " ");
		}
	}

}
