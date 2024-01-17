public class Solution {
    public int solution(int[] numbers) {
        int sum=0;
        for(int x:numbers) {
        	sum+=x;
        }
        int answer = 45-sum;
        
        return answer;
    }
}