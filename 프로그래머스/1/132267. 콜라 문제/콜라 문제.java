public class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        
        while(true) {
        	n-=a;
        	if(n>=0) {
        		n+=b;
        		answer+=b;
        	}else {
        		break;
        	}
        }
        return answer;
    }
}