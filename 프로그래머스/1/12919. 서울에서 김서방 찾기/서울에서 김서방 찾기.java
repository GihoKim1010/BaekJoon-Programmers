public class Solution {
    public String solution(String[] seoul) {
    	
    	int index=0;
    	
    	for(int i=0; i<seoul.length; i++) {
    		if(seoul[i].equals("Kim")) {
    			index=i;
    		}
    	}
    	StringBuilder result = new StringBuilder();
    	result.append("김서방은 ").append(index).append("에 있다");
        String answer = result.toString();
        return answer;
    }
}