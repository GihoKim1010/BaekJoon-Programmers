import java.util.ArrayList;

public class Solution {
	public int[] solution(int[] arr, int k) {
		int[] answer = new int[k];
		for (int j = 0; j < answer.length; j++) {
			answer[j] = -1;
		}
		int i = 0;
		ArrayList<Integer> ar = new ArrayList<>();
		for (int j = 0; j < arr.length; j++) {
			if (i == answer.length) {
				break;
			} else if (!ar.contains(arr[j])) {
				ar.add(arr[j]);
				i++;
			}
		}

		for (int j = 0; j < ar.size(); j++) {
			answer[j] = ar.get(j);
		}

		return answer;
	}
}