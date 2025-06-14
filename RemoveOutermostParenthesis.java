package Strings;

public class RemoveOutermostParenthesis {

	public static void main(String[] args) {
		
		
		String str = "(()())(())";
		String result = "";
	    int open = 0;
	    
	    for(char ch : str.toCharArray()) {
	    	
	    	if(ch == '(') {
	    		
	    		
	    		if(open > 0) result += '(';
	    		open++;
	    	}
	    	else {
	    		open--;
	    		if(open > 0) result += ')';
	    		
	    		
	    	}
	    }
	    
	    System.out.println(result);
	}

}
