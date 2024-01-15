public class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        
        for(int i=0; i<my_string.length(); i++) {
        	char temp = my_string.charAt(i);
        	int a =0;
        	if(Character.isUpperCase(temp)) {
        		a = (int)(temp-'A');
        	}else if(Character.isLowerCase(temp)) {
        		a =(int)(temp-'a'+26);
        	}
        	answer[a]++;
        }
        return answer;
    }
}