import java.util.LinkedList;
import java.util.Queue;

public class Solution {
	public String solution(String[] cards1, String[] cards2, String[] goal) {
		String answer = "Yes";
		Queue<String> x = new LinkedList<>();
		Queue<String> y = new LinkedList<>();

		for (int i = 0; i < cards1.length; i++) {
			x.add(cards1[i]);
		}

		for (int i = 0; i < cards2.length; i++) {
			y.add(cards2[i]);
		}

		for (int i = 0; i < goal.length; i++) {
		    if (!x.isEmpty() && x.peek().equals(goal[i])) {
		        x.poll();
		    } else if (!y.isEmpty() && y.peek().equals(goal[i])) {
		        y.poll();
		    } else {
		        answer = "No";
		        break;
		    }
		}

		return answer;
	}
}