public class Solution {
    public String solution(String myString) {
    	StringBuilder result = new StringBuilder();
    	for(int i=0; i<myString.length(); i++) {
    		char temp = myString.charAt(i);
    		if(temp<'l') {
    			result.append("l");
    		}else {
    			result.append(temp);
    		}
    	}
        String answer = result.toString();
        return answer;
    }
}