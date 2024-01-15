import java.util.ArrayList;
import java.util.Collections;

public class Solution {
	public String[] solution(String myString) {
		ArrayList<String> ar = new ArrayList<>();

		String[] temp = myString.split("x");
		if (temp.length != 0) {
			for (int i = 0; i < temp.length; i++) {
				if(!temp[i].isEmpty()) {
					ar.add(temp[i]);
				}
			}
		}
		Collections.sort(ar);
		String[] answer = new String[ar.size()];
		
		for(int i=0; i<answer.length; i++) {
			answer[i]=ar.get(i);
		}

		return answer;
	}
}