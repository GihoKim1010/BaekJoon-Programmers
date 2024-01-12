public class Solution {

    public int solution(int[][] arr) {
    	
    	int answer = 1;

    	loop_a:
    	for(int i=0; i<arr[0].length; i++) {
    		for(int j=0; j<arr[0].length; j++) {
    			if(arr[i][j]!=arr[j][i]) {
    				answer=0;
    				break loop_a;
    			}
    		}
    	}
    	
        return answer;
    }
}