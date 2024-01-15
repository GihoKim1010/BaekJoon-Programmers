import java.util.Deque;
import java.util.LinkedList;

public class Solution {
	public int[] solution(int[] arr) {
		Deque<Integer> de = new LinkedList<>();
		int i = 0;

		while (i < arr.length) {
			if (de.isEmpty()) {
				de.addLast(arr[i]);
				i++;
			} else if (!de.isEmpty() && de.peekLast() < arr[i]) {
				de.addLast(arr[i]);
				i++;
			} else if (!de.isEmpty() && de.peekLast() >= arr[i]) {
				de.pollLast();
			}
		}
		int[] stk = new int[de.size()];
		for(int j=0; j<stk.length; j++) {
			stk[j]=de.pollFirst();
		}
		return stk;
	}
}