import java.util.Arrays;

public class Solution {
    public String solution(String s) {

    	String[] temp = s.split(" ");
    	int[] tempA = new int[temp.length];
    	for(int i = 0; i<temp.length; i++) {
    		tempA[i]=Integer.valueOf(temp[i]);
    	}
    	
    	Arrays.sort(tempA);

    	StringBuilder result = new StringBuilder();
    	result.append(tempA[0]).append(" ").append(tempA[tempA.length-1]);
    	
    	String answer = result.toString();
        return answer;
    }
}