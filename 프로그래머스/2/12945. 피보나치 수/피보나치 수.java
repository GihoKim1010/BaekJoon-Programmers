public class Solution {
	
    public int solution(int n) {
    	int a=0;
    	int b=1;
    	int c=0;
    	int temp=1;
    	while(temp!=n) {
    		c=(a+b)%1234567;
    		temp++;
    		a=b;
    		b=c;
    	}
        int answer = c%1234567;
        return answer;
    }
}