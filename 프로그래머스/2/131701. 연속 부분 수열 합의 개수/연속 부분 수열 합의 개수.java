import java.util.HashSet;

public class Solution {
    public int solution(int[] elements) {
    	HashSet<Integer> hs = new HashSet<>();
    	
    	for(int i=1; i<=elements.length; i++) {
    		for(int j=0; j<elements.length; j++) {
    			int sum=0;
    			for(int k=0; k<i; k++) {
    				int x=j+k;
    				if(x>=elements.length) {
    					x-=elements.length;
    				}
    				sum+=elements[x];
    			}
    			hs.add(sum);
    		}
    	}
    	
        int answer = hs.size();
        return answer;
    }
}