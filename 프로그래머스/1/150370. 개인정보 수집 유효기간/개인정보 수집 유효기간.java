import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
	public int[] solution(String today, String[] terms, String[] privacies) {

		String[] temp = today.split("\\.");
		int t_year = Integer.valueOf(temp[0]);
		int t_month = Integer.valueOf(temp[1]);
		int t_day = Integer.valueOf(temp[2]);

		HashMap<String, Integer> hs = new HashMap<>();
		for (int i = 0; i < terms.length; i++) {
			String[] temp2 = terms[i].split(" ");
			hs.put(temp2[0], Integer.valueOf(temp2[1]));
		}
		Queue<Integer> qu = new LinkedList<>();
		for (int i = 0; i < privacies.length; i++) {
			String[] temp3 = privacies[i].split("\\.");
			int n_year = Integer.valueOf(temp3[0]);
			int n_month = Integer.valueOf(temp3[1]);
			String[] temp4 = temp3[2].split(" ");
			int n_day = Integer.valueOf(temp4[0]);
			String doc = temp4[1];

			n_month += hs.get(doc);
			while(n_month>12) {
				n_month -= 12;
				n_year++;
			}

			if (n_year < t_year) {
				qu.add(i + 1);
			} else if (n_year == t_year) {
				if (n_month < t_month) {
					qu.add(i + 1);
				} else if (n_month == t_month) {
					if (n_day <= t_day) {
						qu.add(i + 1);
					}
				}
			}
		}
		int[] answer = new int[qu.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = qu.poll();
		}

		return answer;
	}
}