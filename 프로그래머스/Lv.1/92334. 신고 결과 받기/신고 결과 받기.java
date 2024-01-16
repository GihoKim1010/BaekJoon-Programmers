import java.util.HashMap;

public class Solution {

	public int[] solution(String[] id_list, String[] report, int k) {
		int[] answer = new int[id_list.length];
		boolean[][] xx = new boolean[id_list.length][id_list.length];
		int[] count = new int[id_list.length];
		HashMap<String, Integer> hs = new HashMap<>();
		for (int i = 0; i < id_list.length; i++) {
			hs.put(id_list[i], i);
		}

		for (int i = 0; i < report.length; i++) {
			String[] temp = report[i].split(" ");
			if (!xx[hs.get(temp[0])][hs.get(temp[1])]) {
				xx[hs.get(temp[0])][hs.get(temp[1])] = true;
				count[hs.get(temp[1])]++;
			}
		}
		
		for (int i=0; i<id_list.length; i++) {
			if(count[i]>=k) {
				for(int j=0; j<id_list.length; j++) {
					if(xx[j][i]) {
						answer[j]++;
					}
				}
			}
		}
		return answer;
	}
}