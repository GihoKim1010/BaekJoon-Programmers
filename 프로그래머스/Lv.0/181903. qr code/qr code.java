public class Solution {
    public String solution(int q, int r, String code) {
    	StringBuilder result = new StringBuilder();
    	for(int i=0; i<code.length()/q+1; i++) {
    		if(r+i*q>=code.length()){
    			break;
    		}
    		result.append(code.charAt(r+i*q));
    	}
        String answer = result.toString();
        return answer;
    }
}
