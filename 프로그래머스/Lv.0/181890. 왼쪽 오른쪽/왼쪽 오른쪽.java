import java.util.LinkedList;
import java.util.Queue;

public class Solution {
	public String[] solution(String[] str_list) {

		Queue<String> qu = new LinkedList<>();

		for (int i = 0; i < str_list.length; i++) {
			if (str_list[i].equals("l")) {
				for (int j = 0; j < i; j++) {
					qu.add(str_list[j]);
				}
				break;
			} else if (str_list[i].equals("r")) {
				for (int j = i + 1; j < str_list.length; j++) {
					qu.add(str_list[j]);
				}
				break;
			}else {
				continue;
			}
		}

		String[] answer = new String[qu.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = qu.poll();
		}
		return answer;
	}
}