import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public String[] solution(String my_string) {
    	ArrayList<String> ar = new ArrayList<>();
    	
    	for(int i=0; i<my_string.length(); i++) {
    		ar.add(my_string.substring(i, my_string.length()));
    	}
    	
    	Collections.sort(ar);
    	String[] answer = new String[ar.size()];
    	for(int i =0; i<answer.length; i++) {
    		answer[i]=ar.get(i);
    	}
    	
        return answer;
    }
}