public class Solution {

    public int[] solution(String myString) {
    	
    	myString="l"+myString+"l";
    	String[] temp = myString.split("x");
        int[] answer = new int[temp.length];
        for(int i=0; i<answer.length; i++) {
        	answer[i]=temp[i].length();
        }
        answer[0]-=1;
        answer[answer.length-1]-=1;
        
        return answer;
    }
}