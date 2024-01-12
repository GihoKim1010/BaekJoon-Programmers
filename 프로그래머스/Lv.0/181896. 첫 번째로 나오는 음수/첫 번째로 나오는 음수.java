	class Solution {
		public int solution(int[] num_list) {
	    	
	    	int index =-1;
	    	for(int i=0; i<num_list.length; i++) {
	    		if(num_list[i]<0) {
	    			index=i;
	    			break;
	    		}
	    	}
	    	int answer=index;
	        return answer;
	    }
	}