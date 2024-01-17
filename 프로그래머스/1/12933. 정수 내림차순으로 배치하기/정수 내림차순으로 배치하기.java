import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public long solution(long n) {
        ArrayList<Long> ar = new ArrayList<>();
        while(n>0) {
        	ar.add(n%10);
        	n/=10;
        }
        Collections.sort(ar);
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<ar.size(); i++) {
        	sb.append(ar.get(ar.size()-1-i));
        }
        long answer = Long.parseLong(sb.toString());
        
        return answer;
    }
}