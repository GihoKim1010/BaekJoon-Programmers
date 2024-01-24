import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] solution(String s) {
        s=s.replaceAll("\\{", "");
        s=s.replaceAll("\\}", "");
        String[] temp = s.split(",");
        
        HashMap<Integer, Integer> hs = new HashMap<>();
        for(int i=0; i<temp.length; i++) {
        	hs.put(Integer.valueOf(temp[i]), hs.getOrDefault(Integer.valueOf(temp[i]), 0)+1);
        }
        ArrayList<int[]> ar = new ArrayList<>();
        
        for(Map.Entry<Integer, Integer> entry : hs.entrySet()) {
        	int[] temp1 = {entry.getKey(),entry.getValue()};
        	ar.add(temp1);
        }
        
        Collections.sort(ar, Collections.reverseOrder(Comparator.comparing(arr->arr[1])));
        int[] answer = new int[ar.size()];
        for(int i=0; i<answer.length; i++) {
        	answer[i]=ar.get(i)[0];
        }
        
        return answer;
    }
}