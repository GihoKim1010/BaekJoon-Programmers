public class Solution {
    public int solution(String binomial) {
    	
    	String[] temp = binomial.split(" ");
    	int a =Integer.parseInt(temp[0]);
    	int b =Integer.parseInt(temp[2]);
    	int answer = 0;
    	
    	if(temp[1].equals("+")){
    		answer=a+b;
    	}else if(temp[1].equals("-")) {
    		answer=a-b;
    	}else if(temp[1].equals("*")) {
    		answer=a*b;
    	}
    	
        return answer;
    }
}