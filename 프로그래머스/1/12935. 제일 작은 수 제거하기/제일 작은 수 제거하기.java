import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
	public int[] solution(int[] arr) {
		int[] temp = arr.clone();

		Arrays.sort(temp);

		int min = temp[0];
		Queue<Integer> qu = new LinkedList<>();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != min) {
				qu.add(arr[i]);
			}
		}
		
		if(qu.isEmpty()) {
			int[] answer = {-1};
			return answer;
		}else {
			int[] answer = new int[qu.size()];
			for(int i=0; i<answer.length; i++) {
				answer[i]=qu.poll();
			}
			return answer;
		}
	}
}