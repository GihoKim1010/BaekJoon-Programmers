import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int solution(String[] strArr) {
    	HashMap<Integer, Integer> hs = new HashMap<>();
    	for(int i=0; i<strArr.length; i++) {
    		hs.put(strArr[i].length(), hs.getOrDefault(strArr[i].length(), 0)+1);
    	}
    	int answer = 1;
    	for(Map.Entry<Integer, Integer> x : hs.entrySet()) {
    		int value = x.getValue();
    		answer=Math.max(value, answer);
    	}
    	
        return answer;
    }
}