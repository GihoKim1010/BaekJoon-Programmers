import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public int[] solution(int[] num_list, int n) {
    	
    	Queue<Integer> qu = new LinkedList<>();
    	int i=0;
    	while(n*i<num_list.length){
    		qu.add(num_list[n*i]);
    		i++;
    	}
    	
        int[] answer = new int[qu.size()];
        for(int j=0; j<answer.length; j++) {
        	answer[j]=qu.poll();
        }
        return answer;
    }
}