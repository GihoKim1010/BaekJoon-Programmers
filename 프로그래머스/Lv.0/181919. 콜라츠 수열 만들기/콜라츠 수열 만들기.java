import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public int[] solution(int n) {
    	
    	Queue<Integer> qu = new LinkedList<>();
    	qu.add(n);
    	
    	while(n !=1) {
    		if(n%2==0) {
    			n/=2;
    			qu.add(n);
    		}else if(n%2==1){
    			n=3*n+1;
    			qu.add(n);
    		}
    	}
    	
        int[] answer = new int[qu.size()];
        for(int i=0; i<answer.length; i++) {
        	answer[i] = qu.poll();
        }
        return answer;
    }
}