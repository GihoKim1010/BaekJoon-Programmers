public class Solution {
	public String solution(String myString, String pat) {
		int a = myString.lastIndexOf(pat);
		StringBuilder result = new StringBuilder();
		if (a != 0) {
			for (int i = 0; i < a; i++) {
				result.append(myString.charAt(i));
			}
			result.append(pat);
		}else {
			result.append(pat);
		}
		String answer = result.toString();
		return answer;
	}
}