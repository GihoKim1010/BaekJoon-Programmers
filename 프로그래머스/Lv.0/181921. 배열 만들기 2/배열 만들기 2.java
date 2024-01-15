import java.util.ArrayList;

public class Solution {
	public int[] solution(int l, int r) {
		ArrayList<Integer> ar = new ArrayList<>();
		for (int i = l; i <= r; i++) {
			String temp = String.valueOf(i);
			boolean judge = true;
			for (int j = 0; j < temp.length(); j++) {
				char tempA = temp.charAt(j);
				if (tempA=='5' || tempA == '0') {
					continue;
				} else {
					judge = false;
					break;
				}
			}

			if (judge) {
				ar.add(i);
			}
		}
		int[] answer = { -1 };
		if (!ar.isEmpty()) {
			answer = new int[ar.size()];
			for (int j = 0; j < answer.length; j++) {
				answer[j] = ar.get(j);
			}
		}
		return answer;
	}
}