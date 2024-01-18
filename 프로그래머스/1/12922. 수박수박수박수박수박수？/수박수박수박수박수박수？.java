public class Solution {
    public String solution(int n) {
        StringBuilder temp= new StringBuilder();
        if(n%2==1) {
        	temp.append("수");
        	for(int i=0; i<(n-1)/2; i++) {
        		temp.append("박수");
        	}
        }else {
        	for(int i=0; i<n/2; i++) {
        		temp.append("수박");
        	}
        }
        String answer = temp.toString();
        return answer;
    }
}