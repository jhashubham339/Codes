package string;

public class stringBuilder {

	public static void main(String[] args) {
		//Same as String Buffer but this is Npn-Synchronized method-> so the performance is good
		
				StringBuilder sb = new StringBuilder();
				System.out.println(sb.capacity());      //Return  16, Because default capacity is 16
				
				StringBuilder sb1 = new StringBuilder("Shubham");
				System.out.println(sb1.capacity());                 //Return 23, Because 16 + 7	
				
				StringBuilder sb2 = new StringBuilder(1000);
				System.out.println(sb2.capacity());                   //Return 1000 because we provide the string size   
				
//				-------------------------------------------------------------------------------
				
				StringBuilder sb3 = new StringBuilder();
				sb3.append("Shubham Kumar Jha");              // if more then 16 character is there inside then, 
				System.out.println(sb3.capacity());          // it will be like (16*2)+2 =34
				
//		      -------------------------------------------------------------------------------
				StringBuilder sb4 = new StringBuilder("Shubham");
				System.out.println(sb4.length());                   // output = 7 || difference between capacity and length 
				                                        // Capacity return maximum character like 16 , 34 but in length return actual length of the string
//		     ----------------------------------------------------------------------------------
				// So many methods is there inside the string Buffer
				 

	}

}
