package Strings;

import java.util.Collections;

public class reversestring {

	public static void main(String[] args) {
		
		
		String str = "SHARATH";
		String rev = "";
//		
//		for(int i= str.length()-1; i >= 0 ; i--) {
//			
//			rev += str.charAt(i);
//		}
//		
//		System.out.print(rev);
//		
//		System.out.println(str.trim());
		
		
		for(int i=0; i < str.length(); i++) {
			
			rev = str.charAt(i) +rev;
		}
		System.out.println(rev);
		
		
		
	}

}
 