//8.GCD Or HCF(Greatest Common Divisor): two numbers is the largest number that divides them both. 
//Ex :N1 = 9, N2 = 12
//Factors of 9: 1, 3 and 9
//Factors of 12: 1, 2, 3, 4, 6, 12
//Common Factors: 1, 3 out of which 3 is the greatest hence it is the GCD.

package Maths;

public class GCD_or_HCF {

	public static void main(String[] args) {
		//Eucludean algorithm
		// gcd(a,b) = gcd(a-b,b) if a>b
		int a=9, b=12;
		while(a>0 & b>0) {
			if(a>b) {
				a = a%b;
			}else {
				b = b%a;
			}
		}
		if(a==0) {
			System.out.println(b);
		}else {
			System.out.println(a);
		}

	}

}

//Iteration 1
//a<b⇒b=b%a
//b=12%9=3
//New values: 𝑎=9 a=9, 𝑏=3 b=3

//Iteration 2
//𝑎>𝑏⇒𝑎=𝑎%𝑏a>b⇒a=a%b
//a=9%3=0
//New values: 𝑎=0a=0, 𝑏=3b=3

//Termination Condition
//a=0, so the program prints 𝑏=3
//Final Answer: GCD(9, 12) = 3
