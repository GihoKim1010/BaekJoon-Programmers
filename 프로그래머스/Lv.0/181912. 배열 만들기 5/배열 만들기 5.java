import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
    	
    	Queue<Integer> qu = new LinkedList<>();
    	
    	for(int i=0; i<intStrs.length; i++) {
    		StringBuilder temp = new StringBuilder();
    		for(int j=s; j<s+l; j++) {
    			temp.append(intStrs[i].charAt(j));
    		}
    		int x = Integer.valueOf(temp.toString());
    		
    		if(x>k) {
    			qu.add(x);
    		}
    	}
    	
        int[] answer = new int[qu.size()];
        for(int i =0; i<answer.length; i++) {
        	answer[i]=qu.poll();
        }
        return answer;
    }
}