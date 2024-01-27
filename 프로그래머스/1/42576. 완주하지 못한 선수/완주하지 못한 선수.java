import java.util.HashMap;

public class Solution {
	public String solution(String[] participant, String[] completion) {
		String answer = "";

		HashMap<String, Integer> hs = new HashMap<>();

		for (String x : participant) {
			hs.put(x, hs.getOrDefault(x, 0) + 1);
		}

		for (String y : completion) {
			if (!hs.containsKey(y)) {
				answer = y;
				break;
			} else {
				hs.put(y, hs.get(y) - 1);
			}
		}

		for (String z : hs.keySet()) {
			if (hs.get(z) != 0) {
				answer = z;
				break;
			}
		}

		return answer;
	}
}