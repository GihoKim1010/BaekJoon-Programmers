public class Solution {
    public String solution(String my_string, int[] indices) {
    	
    	StringBuilder result = new StringBuilder(my_string);
    	
    	for(int i=0; i<indices.length; i++) {
    		result.setCharAt(indices[i], 'A');
    	}
    	String temp = result.toString();
    	String answer = "";
    	answer =temp.replaceAll("A", "");
    	
        return answer;
    }
}