public class Solution {
    public int[] solution(long n) {
    	String temp= String.valueOf(n);
    	
        int[] answer = new int[temp.length()];
        
        for(int i=0; i<temp.length(); i++) {
        	answer[i]=(int) (n%10);
        	n/=10;
        }
        return answer;
    }
}