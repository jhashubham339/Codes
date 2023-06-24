package Basic;

public class swapNumber {
public static void main(String args[]) {
	int a=23 , b=25 ;
	
	// First Way :-  
//	int temp;
//	temp = a;
//	a=b;
//	b=temp;
//	System.out.println("After Swaped : a = "+a + " , b ="+ b);
	
	//Second way
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("After Swaped : a = "+ a + " , b ="+ b);
}
}
