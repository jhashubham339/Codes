package Array;

public class Sort_an_array_of_0s_1s_and_2s {
	
	static void sortArray(int arr[]) {
		int count1 =0, count2=0, count3=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == 0) {
				count1++;
			}else if(arr[i] == 1) {
				count2++;
			}else {
				count3++;
			}
		}
		int index =0;
		for(int i=0;i<count1;i++) arr[index++] =1;
		for(int i=0;i<count2;i++) arr[index++] =2;
		for(int i=0;i<count3;i++) arr[index++] =3;
			
	}

	public static void main(String[] args) {
		int arr[]= {0, 2, 1, 2, 0, 1};
		sortArray(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
//Time Complexity: O(N) + O(N)
