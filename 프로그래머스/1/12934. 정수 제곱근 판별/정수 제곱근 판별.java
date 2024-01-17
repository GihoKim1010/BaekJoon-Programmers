public class Solution {
    public long solution(long n) {
        long answer = 0;
        for(int i =0; i*i<=n+1; i++) {
        	if((long)i*(long)i==n) {
        		answer=(long)(i+1)*(i+1);
        		break;
        	}
        }
        
        if(answer==0){
        	answer=-1;
        }
        return answer;
    }
}