public class Solution {
	
	public int count1(int a) {
		int count=0;
		while(a>0) {
			if(a%2==1) {
				count++;
			}
			a/=2;
		}
		return count;
	}
	
    public int solution(int n) {
    	int judge = count1(n);
        int answer = n+1;
        
        while(count1(answer)!=judge) {
        	answer++;
        }
        
        return answer;
    }
}