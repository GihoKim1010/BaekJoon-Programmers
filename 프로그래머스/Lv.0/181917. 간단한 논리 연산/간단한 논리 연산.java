public class Solution {
	
	public boolean up(boolean x, boolean y) {
		
		boolean answer = true;
		if(!x && !y) {
			answer=false;
		}
		return answer;
	}
	
	public boolean down(boolean x, boolean y) {
		
		boolean answer = false;
		if(x && y) {
			answer=true;
		}
		return answer;
	}
	
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
    	
        boolean answer = down(up(x1,x2),up(x3,x4));
        return answer;
    }
}