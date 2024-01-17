public class Solution {
	public int solution(int n) {
		int answer = 0;

		if (n == 0) {
			answer = 0;
		} else if (n == 1) {
			answer = 1;
		} else {

			for (int i = 1; i * i <= n; i++) {
				if (n % i == 0) {
					if (i * i == n) {
						answer += i;
					} else {
						answer += (i + n / i);
					}
				}
			}
		}
		return answer;
	}
}