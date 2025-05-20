package Array;
//int arr[]= {1,2,3,4,5,8,9,11}; num =4 
//Output will be = 3 rd index
public class Linear_Search {
	
	static void linearSearch(int arr[],int num) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==num) {
				System.out.println("Found at index: : "+i);
			}
		}
		//return -1; //not found
	}

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,8,9,11};
		linearSearch(arr,4);
	}

}
