public class Solution {
	public int solution(int n) {
		int sum = 0;
		int answer = 0;
		for (int i = 1; i <= n; i++) {
			int temp = i;
            sum=0;
			while (sum < n) {
				sum += temp;
				temp++;
				if(sum==n) {
					answer++;
				}
			}
		}
		return answer;
	}
}