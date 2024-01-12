public class Solution {
    public String[] solution(String my_string) {
    	
    	String[] tempA = my_string.trim().split("\\s+");
    	
        String[] answer = new String[tempA.length];
        for(int i=0; i<tempA.length; i++) {
        	answer[i]=tempA[i];
        }
        return answer;
    }
}