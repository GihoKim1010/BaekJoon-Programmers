import java.util.Stack;

public class Solution {
	
	public String toBinary(int a) {
		Stack<Integer> st = new Stack<>();
		StringBuilder temp = new StringBuilder();
		while(a>0) {
			st.add(a%2);
			a/=2;
		}
		while(st.size()>0) {
			temp.append(st.pop());
		}
		return temp.toString();
	}
	
    public int[] solution(String s) {
        int count0 =0;
        int count1 =0;
        int[] answer = new int [2];
        
        while(!s.equals("1")) {
        	count0=0;
        	count1=0;
        	for(int i =0; i<s.length(); i++) {
        		char temp = s.charAt(i);
        		if(temp=='1') {
        			count1++;
        		}else {
        			count0++;
        		}
        	}
        	s=toBinary(count1);
        	answer[1]+=count0;
        	answer[0]++;
        }
        
        return answer;
    }
}