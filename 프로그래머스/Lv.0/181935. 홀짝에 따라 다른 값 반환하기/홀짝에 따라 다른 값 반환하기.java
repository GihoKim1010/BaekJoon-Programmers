	class Solution {
	    public int solution(int n) {
	    	
	    	int answer = 0;
	    	int i=0;
	    	if(n%2==1) {
	    		while(n-2*i>0) {
	    			answer+=(n-2*i);
	    			i++;
	    		}
	    	}else if(n%2==0) {
	    		while(n-2*i>0) {
	    			answer+=(n-2*i)*(n-2*i);
	    			i++;
	    		}
	    	}
	    	
	        return answer;
	    }
	}