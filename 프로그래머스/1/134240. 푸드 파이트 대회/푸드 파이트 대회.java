import java.util.ArrayList;

public class Solution {
	public String solution(int[] food) {
		ArrayList<Integer> ar = new ArrayList<>();
		for (int i = 1; i < food.length; i++) {
			if (food[i] / 2 >= 1) {
				for (int j = 0; j < food[i] / 2; j++) {
					ar.add(i);
				}
			}
		}
		StringBuilder result = new StringBuilder();
		
		for(int i=0; i<ar.size(); i++) {
			result.append(ar.get(i));
		}
		result.append(0);
		for(int i=ar.size()-1; i>=0; i--) {
			result.append(ar.get(i));
		}
		
		String answer = result.toString();
		return answer;
	}
}