	class Solution {
	    public String solution(String myString) {
	    	
	    	StringBuilder result = new StringBuilder();
	    	
	    	for(int i=0; i<myString.length(); i++) {
	    		char temp = myString.charAt(i);
	    		if(Character.isUpperCase(temp)) {
	    			result.append(Character.toLowerCase(temp));
	    		}else {
	    			result.append(temp);
	    		}
	    	}
	    	
	        String answer = result.toString();
	        return answer;
	    }
	}