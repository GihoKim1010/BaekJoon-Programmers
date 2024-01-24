import java.util.HashMap;

public class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> hs = new HashMap<>();
        for(int i=0; i<clothes.length; i++) {
        	hs.put(clothes[i][1], hs.getOrDefault(clothes[i][1], 0)+1);
        }
        
        for(int x : hs.values()) {
        	answer *=(x+1);
        }
        
        return answer-1;
    }
}