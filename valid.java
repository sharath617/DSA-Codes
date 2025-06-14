package Strings;

import java.util.Stack;

public class valid {
	
	
	public static boolean paranthesis(String str) {
		
		Stack<Character> stack = new Stack<>();
		
		for(char c : str.toCharArray()) {
			
			if(c == '(' || c == '[' || c == '{') {
				stack.add(c);
			}
			
			
			else{
				
			if(stack.isEmpty() ) return false;
			
			char top = stack.pop();
			
			if((top == '(' && c != ')')
					           || (top  == '[' && c != ']') 
					           || (top == '{' && c != '}')){
				return false;
			}
			
		}
		}
		
		return stack.isEmpty();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str = "})][({";
		
		System.out.println(paranthesis(str));
		

	}

}
