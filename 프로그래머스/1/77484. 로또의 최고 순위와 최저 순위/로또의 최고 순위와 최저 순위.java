import java.util.ArrayList;

public class Solution {
	
	public int judge(int z) {
		if(z<=6 && z>=1) {
			return 7-z;
		}else {
			return 6;
		}
	}
	
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        ArrayList<Integer> ar = new ArrayList<>();
        
        for(int x : win_nums) {
        	ar.add(x);
        }
        
        int count_zero=0;
        int same=0;
        for(int y:lottos) {
        	if(y==0) {
        		count_zero++;
        	}else if(ar.contains(y)) {
        		same++;
        	}else {
        		continue;
        	}
        }
        
        int least = same;
        int most = same+count_zero;
        
        answer[0]=judge(most);
        answer[1]=judge(least);
        return answer;
        
    }
}