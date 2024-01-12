public class Solution {
	public String solution(String myString) {

		String temp = myString.toLowerCase();
		String answer = temp.replace("a", "A");
		return answer;
	}
}