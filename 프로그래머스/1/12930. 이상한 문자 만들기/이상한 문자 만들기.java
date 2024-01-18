public class Solution {
    public String solution(String s) {
        String[] temp = s.split(" ",-1);
        for(int i=0; i<temp.length; i++) {
        	StringBuilder result = new StringBuilder();
        	for(int j=0; j<temp[i].length(); j++) {
        		String temp2 = String.valueOf(temp[i].charAt(j));
        		if(j%2==0) {
        			result.append(temp2.toUpperCase());
        		}else {
        			result.append(temp2.toLowerCase());
        		}
        	}
        	temp[i]=result.toString();
        }
        StringBuilder result2 = new StringBuilder(temp[0]);
        if(temp.length>=2) {
        	for(int i=1; i<temp.length; i++) {
        		result2.append(" ").append(temp[i]);
        	}
        }
        
        String answer = result2.toString();
        return answer;
    }
}