import java.util.HashMap;

public class Solution {
	public int solution(String[] want, int[] number, String[] discount) {
		int answer = 0;
		HashMap<String, Integer> hs = new HashMap<>();
		for (int i = 0; i < want.length; i++) {
			hs.put(want[i], i);
		}

		for (int i = 0; i < discount.length - 9; i++) {
			int[] temp = new int[want.length];
			for (int j = i; j <= i + 9; j++) {
				if (hs.containsKey(discount[j])) {
					temp[hs.get(discount[j])]++;
				}
			}
			boolean judge = true;
			for (int j = 0; j < want.length; j++) {
				if (temp[j] != number[j]) {
					judge = false;
					break;
				}
			}

			if (judge) {
				answer++;
			}
		}
		return answer;
	}
}