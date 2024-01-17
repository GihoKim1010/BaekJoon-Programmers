public class Solution {

	public int solution(String s) {
		int answer = 1;
		while (s.length() > 0) {
			int count = 0;
			int n_count = 0;
			int index = 0;
			String x = String.valueOf(s.charAt(0));

			for (int i = 0; i < s.length(); i++) {
				if (String.valueOf(s.charAt(i)).equals(x)) {
					count++;
				} else {
					n_count++;
				}
				index = i;

				if (count == n_count) {
					break;
				}
			}
			s = s.substring(index + 1, s.length());
			if (s.length() != 0) {
				answer++;
			}
		}
		return answer;
	}
}