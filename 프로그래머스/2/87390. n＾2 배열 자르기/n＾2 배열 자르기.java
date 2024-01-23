public class Solution {
    public int[] solution(int n, long left, long right) {
        int[] answer = new int[(int)(right-left+1)];
        
        long y = (left+1)/n+1;
        long x =0;
        if((left+1)%n==0) {
        	y--;
        	x=n;
        }else {
        	x=(left+1)%n;
        }
        
        for(int i=0; i<answer.length; i++) {
        	if(x<=y) {
        		answer[i]=(int)y;
        	}else {
        		answer[i]=(int)x;
        	}
        	x++;
        	if(x>n) {
        		x=1;
        		y++;
        	}
        }
        
        return answer;
    }
}