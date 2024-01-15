import java.util.Deque;
import java.util.LinkedList;

public class Solution {
    public int[] solution(int[] arr, int[] query) {
    	Deque<Integer> de = new LinkedList<>();
    	for(int x: arr) {
    		de.addLast(x);
    	}
    	
    	for(int i=0; i<query.length; i++) {
    		int a=de.size();
    		if(i%2==0) {
    			for(int j=a-1; j>query[i]; j--) {
    				de.pollLast();
    			}
    		}else {
    			for(int j=0; j<query[i]; j++) {
    				de.pollFirst();
    			}
    		}
    	}
        int[] answer = new int[de.size()];
        for(int i=0; i<answer.length; i++) {
        	answer[i]=de.pollFirst();
        }
        return answer;
    }
}