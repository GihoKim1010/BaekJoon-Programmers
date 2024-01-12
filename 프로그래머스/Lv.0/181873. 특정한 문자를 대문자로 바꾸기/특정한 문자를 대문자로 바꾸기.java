public class Solution {
    public String solution(String my_string, String alp) {
    	char temp = alp.charAt(0);
        String answer = my_string.replace(temp, Character.toUpperCase(temp));
        return answer;
    }
}