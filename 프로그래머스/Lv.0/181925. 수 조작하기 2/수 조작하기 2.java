public class Solution {
    public String solution(int[] numLog) {
    	StringBuilder order = new StringBuilder();
    	for(int i=1; i<numLog.length; i++) {
    		if(numLog[i]-numLog[i-1]==1) {
    			order.append("w");
    		}else if(numLog[i]-numLog[i-1]==-1) {
    			order.append("s");
    		}else if(numLog[i]-numLog[i-1]==10) {
    			order.append("d");
    		}else if(numLog[i]-numLog[i-1]==-10) {
    			order.append("a");
    		}
    	}
        String answer = order.toString();
        return answer;
    }
}