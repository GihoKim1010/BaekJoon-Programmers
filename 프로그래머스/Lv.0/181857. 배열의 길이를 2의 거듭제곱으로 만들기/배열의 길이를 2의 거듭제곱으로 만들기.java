public class Solution {
    public int[] solution(int[] arr) {
    	
    	int x=0;
    	int l =1;
    	while(arr.length>l) {
    		x++;
    		l = (int)Math.pow(2,x); 
    	}
        int[] answer = new int[l];
        
        for(int i=0; i<arr.length; i++) {
        	answer[i]=arr[i];
        }
        
        return answer;
    }
}