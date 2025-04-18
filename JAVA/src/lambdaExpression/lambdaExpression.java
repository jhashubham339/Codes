//Lambda is anonymous Function which means
//  -> No name 
//  ->No Modifier
//  ->No Return Type

package lambdaExpression;

public class lambdaExpression {

	public static void main(String[] args) {
		
		// 1st way:-
//		implementInterface fi =new implementInterface();
//		fi.sayHello();

		 //3rd way: Lambda Expression
		functionalInterface i = ()->{
			System.out.println("This is my 1 st lambda ");
		};
		i.sayHello();
		
		functionalInterface ii = ()->System.out.println("2nd lambda");
		
		ii.sayHello();
		
		//addNumber
		addNumber sum = (int a ,int b)-> a+b;
		System.out.println("The sum is : "+sum.add(2,2));
		
		stringLength l = (str -> str.length());
		System.out.println("The length is : "+l.lengthCount("Shubham"));
	}

}
