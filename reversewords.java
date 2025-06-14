package Strings;

import java.util.ArrayList;
import java.util.Collections;

public class reversewords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "a good   example";
		String rev = "";
		
		String[] temp = str.trim().split("\\s+");
		
		
		for(int i= temp.length-1; i >=0 ; i--) {
			
			rev += temp[i];
			
			if(i != 0) {
				rev += " ";
			}
		}
		
		System.out.println(rev);
		
		
		
		
		
//		ArrayList<String> list = new ArrayList<>();
//		
//		for(int i=0; i <str.length(); i++) {
//			
//			if(str.charAt(i) != ' ') {
//				
//				temp += str.charAt(i);
//				
//			}
//			else {
//				temp = temp.trim();
//				list.add(temp);
//				temp = "";
//				
//			}
//		}
//		
//		if(!temp.isEmpty()) {
//			temp = temp.trim();
//			list.add(temp);
//		}
//		
//	  Collections.reverse(list);
//	  
//	  String result = String.join(" ", list);
//	  
//	  System.out.println(result);
	  
	  
		

	}

}
