import java.util.Deque;
import java.util.LinkedList;

public class Solution {
	public int[] solution(int[] arr) {
		int i = 0;
		Deque<Integer> de = new LinkedList<>();
		while (i < arr.length) {
			if (de.isEmpty()) {
				de.addLast(arr[i]);
				i++;
			} else if (!de.isEmpty() && de.peekLast() == arr[i]) {
				de.pollLast();
				i++;
			} else if (!de.isEmpty() && de.peekLast() != arr[i]) {
				de.addLast(arr[i]);
				i++;
			}
		}

		int[] answer = {};
		if (de.isEmpty()) {
			answer = new int[1];
			answer[0] = -1;
		} else {
			answer = new int[de.size()];
			for (int j = 0; j < answer.length; j++) {
				answer[j] = de.pollFirst();
			}
		}
		return answer;
	}
}