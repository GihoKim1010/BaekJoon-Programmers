import java.util.Deque;
import java.util.LinkedList;

public class Solution {
	public int[] solution(int[] arr, boolean[] flag) {
		Deque<Integer> de = new LinkedList<>();
		for (int i = 0; i < arr.length; i++) {
			if (flag[i]) {
				for (int j = 0; j < 2 * arr[i]; j++) {
					de.addLast(arr[i]);
				}
			} else {
				for (int j = 0; j < arr[i]; j++) {
					de.pollLast();
				}
			}
		}
		int[] answer = new int[de.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = de.pollFirst();
		}
		return answer;
	}
}