import java.util.LinkedList;
import java.util.Queue;

public class Solution {
	public int[] solution(int[] progresses, int[] speeds) {
		Queue<Integer> qu = new LinkedList<>();
		for (int i = 0; i < progresses.length; i++) {
			if ((100 - progresses[i]) % speeds[i] == 0) {
				qu.add((100 - progresses[i]) / speeds[i]);
			} else {
				qu.add((100 - progresses[i]) / speeds[i] + 1);
			}
		}

		Queue<Integer> result = new LinkedList<>();
		int count = 0;
		int max = 0;
		while (qu.size() > 0) {
			int temp = qu.poll();
			max = Math.max(max, temp);
			count++;
			if (qu.size() > 0 && max >= qu.peek()) {
				continue;
			} else {
				result.add(count);
				count = 0;
			}
		}

		int[] answer = new int[result.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = result.poll();
		}
		return answer;
	}
}