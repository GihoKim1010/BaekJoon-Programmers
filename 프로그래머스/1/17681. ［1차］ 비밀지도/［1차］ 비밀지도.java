import java.util.Stack;

public class Solution {

	public String change(int a, int n) {
		Stack<Integer> st = new Stack<>();
		for (int i = 0; i < n; i++) {
			st.add(a % 2);
			a /= 2;
		}
		StringBuilder x = new StringBuilder();
		for (int i = 0; i < n; i++) {
			x.append(st.pop());
		}
		return x.toString();
	}

	public String[] solution(int n, int[] arr1, int[] arr2) {
		String[] answer = new String[n];

		for (int i = 0; i < n; i++) {
			String x = change(arr1[i], n);
			String y = change(arr2[i], n);

			StringBuilder temp = new StringBuilder();
			for (int j = 0; j < n; j++) {
				if (x.charAt(j) == '1' || y.charAt(j) == '1') {
					temp.append("#");
				}else {
					temp.append(" ");
				}
			}
			answer[i]=temp.toString();
		}
		return answer;
	}
}