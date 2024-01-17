public class Solution {
    boolean solution(String s) {
        boolean answer = true;

        String t = s.toLowerCase();
        
        int count_p=0;
        int count_y=0;
        for(int i=0; i<t.length(); i++) {
        	String temp=String.valueOf(t.charAt(i));
        	if (temp.equals("p")) {
        		count_p++;
        	}else if (temp.equals("y")) {
        		count_y++;
        	}
        }
        
        if(count_p!=count_y) {
        	answer=false;
        }

        return answer;
    }
}