public class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        boolean[] wall = new boolean[n+1];
        for(int i=0; i<section.length; i++) {
        	wall[section[i]]=true;
        }
        try {
        	for(int i=0; i<wall.length; i++) {
        		if(wall[i]) {
        			for(int j=0; j<m; j++) {
        				wall[i+j]=false;
        			}
        			answer++;
        		}
        	}
        }catch(IndexOutOfBoundsException e) {
        	answer++;
        }
        
        return answer;
    }
}