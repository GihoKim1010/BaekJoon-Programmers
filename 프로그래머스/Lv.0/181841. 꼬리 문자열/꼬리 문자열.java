public class Solution {

    public String solution(String[] str_list, String ex) {
    	
    	StringBuilder result = new StringBuilder();
    	for(String x:str_list) {
    		if(!x.contains(ex))
    		result.append(x);
    	}
    	
        String answer = result.toString();
        return answer;
    }
}