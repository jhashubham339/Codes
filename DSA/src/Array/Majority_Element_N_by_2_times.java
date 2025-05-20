package Array;

public class Majority_Element_N_by_2_times {
	
	static void majority_element(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			int count=0;
			for(int j=0;j<arr.length;j++) {
				if(arr[j]==arr[i])
					count++;
			}
			if(count > arr.length/2)
				System.out.println(arr[i]);
			return;
		}
	}

	public static void main(String[] args) {
		int arr[]= {2, 2, 1, 1, 1, 2, 2};
		majority_element(arr);
	}

}
//Time complexity = O(n²)
