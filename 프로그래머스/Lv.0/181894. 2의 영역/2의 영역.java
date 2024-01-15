import java.util.ArrayList;
import java.util.Collections;

public class Solution {
	public int[] solution(int[] arr) {
		ArrayList<Integer> ar = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 2) {
				ar.add(i);
			}
		}
		int[] answer= {-1};
		if (ar.size() != 0) {
			Collections.sort(ar);

			int left = ar.get(0);
			int right = ar.get(ar.size() - 1);

			answer = new int[right - left + 1];
			for (int i = left; i <= right; i++) {
				answer[i - left] = arr[i];
			}
		}
		return answer;
	}
}