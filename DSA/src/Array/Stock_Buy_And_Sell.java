package Array;

public class Stock_Buy_And_Sell {
	
	static void stockBuy(int arr[]) {
		int mini= arr[0];
		int profit =0;
		for(int i=1;i<arr.length;i++) {
			int cost = arr[i]-mini;
			profit = Math.max(profit,cost);
			mini = Math.min(mini, arr[i]);
		}
		System.out.println(profit);
	}

	public static void main(String[] args) {
		int arr[] ={7,1,5,3,6,4};
		stockBuy(arr);
	}

}
//Time complexity: O(n)