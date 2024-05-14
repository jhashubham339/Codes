//1.Extract Digits: Ex: N =7789 OUTPUT: [9,8,7,7]

package Maths;

public class Extract_Digits {

	public static void main(String[] args) {
		 int n =7789, lastDigit;
		    while(n>0){
		         lastDigit = n % 10;
		         n =n/10;
			    System.out.println(lastDigit);
			}
	}

}
