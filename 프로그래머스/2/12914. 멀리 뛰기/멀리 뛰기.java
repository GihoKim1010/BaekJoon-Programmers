public class Solution {
	public long solution(int n) {
		long answer = 0L;
		long a = 1L;
		long b = 2L;
		int k = 3;
		if (n == 1) {
			answer = 1;
		} else if (n == 2) {
			answer = 2;
		} else {
			while (k <= n) {
				answer = (a + b) % 1234567;
				k++;
				a = b;
				b = answer;
			}
		}
		return answer;
	}
}