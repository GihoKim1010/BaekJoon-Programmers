public class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        for(int i=1; i<=yellow; i++) {
        	int temp = 0;
        	if(yellow%i==0) {
        		temp = yellow/i;
        	}
        	if(4+2*i+2*temp==brown) {
        		answer[1]=i+2;
        		answer[0]=temp+2;
        		break;
        	}
        }
        return answer;
    }
}