class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
       StringBuilder result = new StringBuilder();
		result.append(my_string);
		String newString = overwrite_string.replace("\"", "");
		result.replace(s, s + newString.length(), newString);
		String answer = result.toString();
		return answer;
    }
}