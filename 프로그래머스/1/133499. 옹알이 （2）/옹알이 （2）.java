public class Solution {
    public int solution(String[] babbling) {
    	int answer = 0;
    	
    	for(int i=0; i<babbling.length; i++) {
    		if(!babbling[i].contains("ayaaya") && !babbling[i].contains("yeye") && !babbling[i].contains("woowoo") && !babbling[i].contains("mama")) {
    			babbling[i]=babbling[i].replaceAll("aya", "x");
        		babbling[i]=babbling[i].replaceAll("ye", "x");
        		babbling[i]=babbling[i].replaceAll("woo", "x");
        		babbling[i]=babbling[i].replaceAll("ma", "x");
        		babbling[i]=babbling[i].replaceAll("x", "");
    		}
    		
    		if(babbling[i].isEmpty()) {
    			answer++;
    		}
    	}
        return answer;
    }
}