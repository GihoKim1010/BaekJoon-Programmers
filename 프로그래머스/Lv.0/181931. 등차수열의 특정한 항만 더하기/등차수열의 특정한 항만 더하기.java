public class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        
        for(int i=0; i<included.length; i++) {
        	int temp = a+i*d;
        	if(included[i]) {
        		answer+=temp;
        	}
        }
        
        return answer;
    }
}