	class Solution {
	    public String solution(String myString) {
	    	
	    	StringBuilder result = new StringBuilder();
	    	
	    	for(int i=0; i<myString.length(); i++) {
	    		char temp = myString.charAt(i);
	    		
	    		if(Character.isLowerCase(temp)) {
	    			temp =Character.toUpperCase(temp);
	    		}
	    		result.append(temp);
	    	}
	    	
	        String answer = result.toString();
	        return answer;
	    }
	}