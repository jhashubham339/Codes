package Basic;

public class addArraySum {
	public static void main(String args[]) {
		int arr[]={2,4,6,4,6};
		int sum =0,i;
		for(i=0;i<=4;i++) {
			sum = sum+arr[i];
			System.out.println("Sum of the array is :" + sum);
		}
	
	}
}
