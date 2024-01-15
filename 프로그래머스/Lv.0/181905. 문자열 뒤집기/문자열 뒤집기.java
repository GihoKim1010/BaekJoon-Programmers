import java.util.Stack;

public class Solution {
	public String solution(String my_string, int s, int e) {
		StringBuilder result = new StringBuilder();
		Stack<String> st = new Stack<>();
		for (int i = s; i <= e; i++) {
			String temp = String.valueOf(my_string.charAt(i));
			st.add(temp);
		}

		for (int i = 0; i < my_string.length(); i++) {
			if (i >= s && i <= e) {
				result.append(st.pop());
			} else {
				result.append(my_string.charAt(i));
			}
		}
		String answer = result.toString();
		return answer;
	}
}