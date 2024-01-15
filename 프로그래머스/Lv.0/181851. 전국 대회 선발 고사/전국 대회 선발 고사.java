import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Solution {
    public int solution(int[] rank, boolean[] attendance) {
    	HashMap<Integer, Integer> hs = new HashMap<>();
    	ArrayList<Integer> ar = new ArrayList<>();
    	for(int i =0; i<rank.length; i++) {
    		if(attendance[i]) {
    			hs.put(rank[i],i);
    			ar.add(rank[i]);
    		}
    	}
    	Collections.sort(ar);
    	int a=hs.get(ar.get(0));
    	int b=hs.get(ar.get(1));
    	int c=hs.get(ar.get(2));
    	
        int answer = a*10000+b*100+c;
        return answer;
    }
}