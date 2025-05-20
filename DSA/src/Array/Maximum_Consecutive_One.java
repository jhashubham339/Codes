package Array;

public class Maximum_Consecutive_One {
	
	static void maxOne(int arr[]) {
		int currentCount =0;
		int maxCount =0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==1) {
				currentCount++;
				if(currentCount>maxCount) {
					maxCount = currentCount;
				}
			}else {
				currentCount =0;
			}
		}
		System.out.println(maxCount);
	}

	public static void main(String[] args) {
		int arr[] = {1, 1, 0, 0, 1, 1, 0, 1, 0, 1, 1, 1, 1};
		maxOne(arr);
	}

}
