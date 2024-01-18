import java.util.LinkedList;
import java.util.Queue;

public class Solution {
	public int[] solution(int[] arr) {
		int[] answer = {};
		if (arr.length != 0) {
			Queue<Integer> qu = new LinkedList<>();
			qu.add(arr[0]);
			for (int i = 1; i < arr.length; i++) {
				if(arr[i]!=arr[i-1]) {
					qu.add(arr[i]);
				}
			}
			answer=new int[qu.size()];
			for(int i=0; i<answer.length; i++) {
				answer[i]=qu.poll();
			}
		}
		return answer;
	}
}