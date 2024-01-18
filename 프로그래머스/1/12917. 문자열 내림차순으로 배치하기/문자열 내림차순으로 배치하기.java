import java.util.Arrays;

public class Solution {
	public String solution(String s) {
		
		char[] temp = s.toCharArray();
		Arrays.sort(temp);
		
		StringBuilder xx = new StringBuilder(s.length());
		for(int i =0; i<s.length(); i++) {
			xx.append(temp[s.length()-1-i]);
		}
		String answer = xx.toString();
		return answer;
	}
}