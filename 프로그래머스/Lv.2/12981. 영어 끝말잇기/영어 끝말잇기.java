import java.util.HashSet;

public class Solution {
	public int[] solution(int n, String[] words) {
		int[] answer = new int[2];
		HashSet<String> hs = new HashSet<>();
		hs.add(words[0]);
		for (int i = 1; i < words.length; i++) {
			String last = String.valueOf(words[i - 1].charAt(words[i - 1].length() - 1));
			String first = String.valueOf(words[i].charAt(0));

			if (!first.equals(last) || hs.contains(words[i])) {
				answer[0] = (i + 1) % n;
				answer[1] = (i + 1) / n + 1;
				if (answer[0] == 0) {
					answer[0] = n;
					answer[1]--;
				}
				break;
			}else {
				hs.add(words[i]);
			}
		}

		return answer;
	}
}