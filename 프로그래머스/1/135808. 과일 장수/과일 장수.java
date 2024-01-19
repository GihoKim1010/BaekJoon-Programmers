import java.util.Arrays;
import java.util.Stack;

public class Solution {
    public int solution(int k, int m, int[] score) {
        Arrays.sort(score);
        Stack<Integer> st = new Stack<>();
        for(int i =0; i<score.length; i++) {
        	st.add(score[i]);
        }
        
        int answer = 0;
        int temp=0;
        while(st.size()>=m) {
        	for(int i=0; i<m; i++) {
        		temp =st.pop();
        	}
        	answer+=temp*m;
        }
        
        return answer;
    }
}