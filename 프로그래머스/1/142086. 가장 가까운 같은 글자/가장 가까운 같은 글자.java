import java.util.HashMap;

public class Solution {
	public int[] solution(String s) {
		int[] answer = new int[s.length()];
		HashMap<String, Integer> hs = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			String temp = String.valueOf(s.charAt(i));
			if (hs.containsKey(temp)) {
				answer[i] = i - hs.get(temp);
				hs.put(temp, i);
			} else {
				answer[i]=-1;
				hs.put(temp, i);
			}
		}
		return answer;
	}
}