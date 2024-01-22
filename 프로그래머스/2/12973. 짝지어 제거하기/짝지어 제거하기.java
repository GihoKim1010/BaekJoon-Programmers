import java.util.Stack;

public class Solution {
	public int solution(String s) {

		int answer = -1;
		Stack<String> st = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			if (st.size() >= 1 && st.peek().equals(String.valueOf(s.charAt(i)))) {
				st.pop();
				continue;
			} else {
				st.add(String.valueOf(s.charAt(i)));
			}
		}

		if(st.isEmpty()) {
			answer=1;
		}else {
			answer=0;
		}
		return answer;
	}
}