public class Solution {
	public String solution(int a, int b) {
		int dif = b - 1;
		int[] last = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		if (a > 1) {
			for (int i = 0; i < a - 1; i++) {
				dif+=last[i];
			}
		}
		dif%=7;
		
		String[] result = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
		
		String answer = result[dif];
		return answer;
	}
}