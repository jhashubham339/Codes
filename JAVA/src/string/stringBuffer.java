package string;

public class stringBuffer {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());      //Return  16, Because default capacity is 16
		
		StringBuffer sb1 = new StringBuffer("Shubham");
		System.out.println(sb1.capacity());                 //Return 23, Because 16 + 7	
		
		StringBuffer sb2 = new StringBuffer(1000);
		System.out.println(sb2.capacity());                   //Return 1000 because we provide the string size   
		
//		-------------------------------------------------------------------------------
		
		StringBuffer sb3 = new StringBuffer();
		sb3.append("Shubham Kumar Jha");              // if more then 16 character is there inside then, 
		System.out.println(sb3.capacity());          // it will be like (16*2)+2 =34
		
//      -------------------------------------------------------------------------------
		StringBuffer sb4 = new StringBuffer("Shubham");
		System.out.println(sb4.length());                   // output = 7 || difference between capacity and length 
		                                        // Capacity return maximum character like 16 , 34 but in length return actual length of the string
//     ----------------------------------------------------------------------------------
		// So many methods is there inside the string Buffer

	}

}
