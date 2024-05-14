//7.Check for Prime: A number that has exactly two factors one and itself.
//Ex: 2, 3, 5, 7, 11, 13, 17, 19, 23, 29 ...

package Maths;

public class Prime_Number {

	public static void main(String[] args) {
		 int n=7,count =0;
		    for(int i=1;i<=n;i++){
		        if(n%i==0){
		            count++;
		        }
		    }
		     if(count ==2){
		            System.out.print("prime Number");
		        }else{
		          System.out.print("Not prime Number");
		        }
	}
}

//TC = O(n)
//SC = O(1)

//code360: https://bit.ly/3ZdiWOO
//gfg : https://www.geeksforgeeks.org/problems/minimum-number-of-jumps-1587115620/1