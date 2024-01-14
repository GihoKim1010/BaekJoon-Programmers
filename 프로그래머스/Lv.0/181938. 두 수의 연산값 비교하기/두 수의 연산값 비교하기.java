	class Solution {
	    public int solution(int a, int b) {
	    	
	    	StringBuilder temp=new StringBuilder();
	    	temp.append(String.valueOf(a)).append(String.valueOf(b));
	    	String calc = temp.toString();
	    	int result_a = Integer.valueOf(calc);
	    	
	    	int result_b = 2*a*b;
	    	
	        int answer = Math.max(result_a, result_b);
	        return answer;
	    }
	}