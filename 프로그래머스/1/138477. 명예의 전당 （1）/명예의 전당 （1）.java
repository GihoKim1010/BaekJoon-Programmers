import java.util.ArrayList;
import java.util.Collections;

public class Solution {
	public int[] solution(int k, int[] score) {
		int[] answer = new int[score.length];
		ArrayList<Integer> topk = new ArrayList<>();
		for (int i = 0; i < score.length; i++) {
			topk.add(score[i]);
			Collections.sort(topk);
			if (topk.size() <= k) {
				answer[i]=topk.get(0);
			}else {
				answer[i]=topk.get(1);
				topk.remove(0);
			}
		}
		return answer;
	}
}