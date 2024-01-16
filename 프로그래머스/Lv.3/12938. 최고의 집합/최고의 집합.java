public class Solution {
    public int[] solution(int n, int s) {
        int[] answer = {};
        
        if(s<n) {
        	answer=new int[1];
        	answer[0]=-1;
        }else {
        	answer=new int[n];
        	int min = s/n;
        	int remainder = s%n;
        	for(int j=0; j<n; j++) {
        		answer[j]=min;
        	}
        	int i=0;
        	while(remainder!=0) {
        		answer[n-1-i]++;
        		i++;
        		remainder--;
        	}
        	
        }
        
        return answer;
    }
}
