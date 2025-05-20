package Test_Practice2;
public class ReverseArray_Normal {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,8,9,11};
		
		for(int i=0;i<arr.length;i++) {
			
			System.out.print(arr[arr.length-1-i] + " ");
		}
	}

}
//Time – Complexity : O(n)
//Space-Complexity : O(1)