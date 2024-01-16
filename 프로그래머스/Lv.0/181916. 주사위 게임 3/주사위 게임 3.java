import java.util.Arrays;

public class Solution {
    public int solution(int a, int b, int c, int d) {
    	int[] dice = new int[4];
    	dice[0]=a;
    	dice[1]=b;
    	dice[2]=c;
    	dice[3]=d;
    	
    	Arrays.sort(dice);
    	
    	int answer = 0;
    	if(dice[0]==dice[1] && dice[1]==dice[2] && dice[2]==dice[3]) {
    		answer=1111*dice[0];
    	}else if (dice[0]==dice[1] && dice[1]==dice[2] && dice[2]!=dice[3]) {
    		answer=(10*dice[0]+dice[3])*(10*dice[0]+dice[3]);
    	}else if (dice[0]!=dice[1] && dice[1]==dice[2] && dice[2]==dice[3]) {
    		answer=(10*dice[3]+dice[0])*(10*dice[3]+dice[0]);
    	}else if (dice[0]==dice[1] && dice[1]!=dice[2] && dice[2]==dice[3]) {
    		answer=(dice[0]+dice[3])*(dice[3]-dice[0]);
    	}else if (dice[0]==dice[1] && dice[1]!=dice[2] && dice[2]!=dice[3]) {
    		answer=dice[2]*dice[3];
    	}else if (dice[0]!=dice[1] && dice[1]==dice[2] && dice[2]!=dice[3]) {
    		answer=dice[0]*dice[3];
    	}else if (dice[0]!=dice[1] && dice[1]!=dice[2] && dice[2]==dice[3]) {
    		answer=dice[0]*dice[1];
    	}else if (dice[0]!=dice[1] && dice[1]!=dice[2] && dice[2]!=dice[3]) {
    		answer=dice[0];
    	}
        return answer;
    }
}