import java.util.ArrayList;
import java.util.Collections;

public class Solution {
	public int[] solution(String[] wallpaper) {
		int[] answer = new int[4];

		ArrayList<Integer> y = new ArrayList<>();
		ArrayList<Integer> x = new ArrayList<>();
		int temp = 0;
		for (int i = 0; i < wallpaper.length; i++) {
			String temp3 = wallpaper[i];
			temp = temp3.indexOf("#");
			while (temp != -1) {
				StringBuilder temp2 = new StringBuilder(temp3);
				temp2.setCharAt(temp, 'w');
				y.add(i);
				x.add(temp);
				temp3 = temp2.toString();
				temp=temp3.indexOf("#");
			}
		}

		Collections.sort(y);
		Collections.sort(x);

		answer[0] = y.get(0);
		answer[1] = x.get(0);
		answer[2] = y.get(x.size() - 1) + 1;
		answer[3] = x.get(x.size() - 1) + 1;

		return answer;
	}
}