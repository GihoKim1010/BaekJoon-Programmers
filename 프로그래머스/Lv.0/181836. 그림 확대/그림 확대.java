public class Solution {
	public String[] solution(String[] picture, int k) {
		String[] answer = new String[k * picture.length];
		for (int i = 0; i < picture.length; i++) {
			StringBuilder temp = new StringBuilder();
			for (int j = 0; j < picture[i].length(); j++) {
				for(int l=0; l<k; l++) {
					temp.append(picture[i].charAt(j));
				}
			}
			String result = temp.toString();
			for (int l = 0; l < k; l++) {
				answer[k * i + l] = result;
			}
		}
		return answer;
	}
}