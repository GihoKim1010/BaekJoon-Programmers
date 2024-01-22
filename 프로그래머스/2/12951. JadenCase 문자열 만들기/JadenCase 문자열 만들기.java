public class Solution {
    public String solution(String s) {
    	StringBuilder temp = new StringBuilder();
    	temp.append(String.valueOf(s.charAt(0)).toUpperCase());
    	for(int i=1; i<s.length(); i++) {
    		if(String.valueOf(s.charAt(i-1)).equals(" ")) {
    			temp.append(String.valueOf(s.charAt(i)).toUpperCase());
    		}else {
    			temp.append(String.valueOf(s.charAt(i)).toLowerCase());
    		}
    	}
        String answer = temp.toString();
        return answer;
    }
}