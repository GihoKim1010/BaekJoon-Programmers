public class Solution {
    public int solution(int n) {
    	
    	boolean[] judge = new boolean[n+1];
    	judge[0]=true;
    	judge[1]=true;
    	
    	for(int i=2; i*i<=n; i++) {
    		if(!judge[i]) {
    			for(int j=2; j*i<=n; j++) {
    				judge[i*j]=true;
    			}
    		}
    	}
    	
    	int count=0;
    	for(int i=1; i<=n; i++) {
    		if(!judge[i]) {
    			count++;
    		}
    	}
    	
        int answer = count;
        return answer;
    }
}