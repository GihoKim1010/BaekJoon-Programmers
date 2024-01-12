public class Solution {
    public int solution(int[] arr, int idx) {
        int answer = -1;
        
        if(idx<arr.length) {
        	for(int i=idx; i<arr.length; i++) {
        		if(arr[i]==1) {
        			answer=i;
        			break;
        		}
        	}
        	
        }
        return answer;
    }
}