public class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        for(int i=0; i<babbling.length; i++) {
        	babbling[i]=babbling[i].replace("aya", "x");
        	babbling[i]=babbling[i].replace("ye", "x");
        	babbling[i]=babbling[i].replace("woo", "x");
        	babbling[i]=babbling[i].replace("ma", "x");
        	
        	if(babbling[i].replace("x", "").isEmpty()) {
        		answer++;
        	}
        }
        
        return answer;
    }
}