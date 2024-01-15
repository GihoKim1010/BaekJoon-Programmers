public class Solution {
    public int solution(String number) {
        int sum =0;
        
        for(int i=0; i<number.length(); i++) {
        	char temp = number.charAt(i);
        	int x = (int) temp-'0';
        	sum +=x;
        }
        int answer = sum%9;
        return answer;
    }
}