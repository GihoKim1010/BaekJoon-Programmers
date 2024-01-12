import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
    	
    	Queue<String> qu = new LinkedList<>();
    	for(int i=0; i<todo_list.length; i++) {
    		if(!finished[i]) {
    			qu.add(todo_list[i]);
    		}
    	}
    	
        String[] answer = new String[qu.size()];
        
        for(int i =0; i<answer.length; i++) {
        	answer[i]=qu.poll();
        }
        return answer;
    }
}