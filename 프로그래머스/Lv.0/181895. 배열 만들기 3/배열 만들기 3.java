import java.util.LinkedList;
import java.util.Queue;

public class Solution {
	public int[] solution(int[] arr, int[][] intervals) {

		Queue<Integer> qu = new LinkedList<>();
		for (int i = 0; i <= 1; i++) {
			for (int j = intervals[i][0]; j <= intervals[i][1]; j++) {
				qu.add(arr[j]);
			}
		}

		int[] answer = new int[qu.size()];
		for(int i=0; i<answer.length; i++) {
			answer[i]=qu.poll();
		}
		return answer;
	}
}