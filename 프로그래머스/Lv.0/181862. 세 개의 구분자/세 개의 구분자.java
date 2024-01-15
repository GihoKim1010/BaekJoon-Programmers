import java.util.LinkedList;
import java.util.Queue;

public class Solution {
	public String[] solution(String myStr) {

		String tempStrA = myStr.replaceAll("b", "a");
		String tempStrB = tempStrA.replaceAll("c", "a");

		String[] temp = tempStrB.split("a");
		Queue<String> qu = new LinkedList<>();
		for (int i = 0; i < temp.length; i++) {
			if (!temp[i].isEmpty()) {
				qu.add(temp[i]);
			}
		}
		String[] answer = {};
		if (qu.size() == 0) {
			answer = new String[1];
			answer[0] = "EMPTY";
		} else {
			answer = new String[qu.size()];
			for (int i = 0; i < answer.length; i++) {
				answer[i] = qu.poll();
			}
		}
		return answer;
	}
}