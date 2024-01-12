import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    public String[] solution(String[] strArr) {
    	
    	Queue<String> qu = new LinkedList<>();
    	for(String x: strArr) {
    		if(!x.contains("ad")) {
    			qu.add(x);
    		}
    	}
    	
        String[] answer = new String[qu.size()];
        for(int i=0; i<answer.length; i++) {
        	answer[i]=qu.poll();
        }
        return answer;
    }
}