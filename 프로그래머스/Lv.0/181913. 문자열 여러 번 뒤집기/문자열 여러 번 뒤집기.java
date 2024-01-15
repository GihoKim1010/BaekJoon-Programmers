public class Solution {
    public String solution(String my_string, int[][] queries) {
    	
    	StringBuilder temp = new StringBuilder(my_string);
    	for(int i=0; i<queries.length; i++) {
    		String x=temp.substring(queries[i][0], queries[i][1]+1);
    		StringBuilder y=new StringBuilder(x);
    		temp.replace(queries[i][0], queries[i][1]+1, y.reverse().toString());
    	}
        String answer = temp.toString();
        return answer;
    }
}