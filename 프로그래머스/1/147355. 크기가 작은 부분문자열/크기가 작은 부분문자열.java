public class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        long lp = Long.parseLong(p);
        
        for(int i=0; i<=t.length()-p.length(); i++) {
        	String temp = t.substring(i, i+p.length());
        	long ltemp = Long.parseLong(temp);
        	if(ltemp<=lp) {
        		answer++;
        	}
        }
        return answer;
    }
}