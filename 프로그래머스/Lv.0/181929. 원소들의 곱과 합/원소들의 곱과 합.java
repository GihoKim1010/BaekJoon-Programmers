	class Solution {
	    public int solution(int[] num_list) {
	    	
	    	int x=1;
	    	int y=0;
	    	int answer = 0;
	    	for(int i=0; i<num_list.length; i++) {
	    		x*=num_list[i];
	    		y+=num_list[i];
	    	}
	    	y=(int) Math.pow(y, 2);
	    	
	    	if(x<y) {
	    		answer=1;
	    	}
	    	
	        return answer;
	    }
	}