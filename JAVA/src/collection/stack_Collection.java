package collection;
import java.util.Stack;
public class stack_Collection {

	public static void main(String[] args) {
		Stack s = new Stack();
		
		s.push(100);  
		s.push(200);
		s.push(400);
		s.push(500);
		s.push("Shubham");
		s.push('c');
		s.push(1000);

        System.out.println(s);        // Output -> [100, 200, 400, 500, Shubham, c, 1000]
     
        s.pop();   
	    System.out.println(""+s); //OutPut -> [100, 200, 400, 500, Shubham, c]
	  
		System.out.println(""+s.peek());  //Output -> c
		
		System.out.println(""+s.search(500)); //Output ->  3
		
		System.out.println(""+s.empty());      // Output -> false
 
	}

}
