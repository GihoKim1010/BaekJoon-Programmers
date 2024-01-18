import java.util.Arrays;

public class Solution {
    public int solution(int[][] sizes) {
        
        int[] x = new int[sizes.length];
        int[] y = new int[sizes.length];
        
        for(int i=0; i<sizes.length; i++) {
        	x[i]=Math.max(sizes[i][0], sizes[i][1]);
        	y[i]=Math.min(sizes[i][0], sizes[i][1]);
        }
        
        Arrays.sort(x);
        Arrays.sort(y);
        int answer = x[sizes.length-1]*y[sizes.length-1];
        
        return answer;
    }
}