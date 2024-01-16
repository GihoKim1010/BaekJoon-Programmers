import java.util.ArrayList;
import java.util.HashMap;

public class Solution {
    public String[] solution(String[] record) {
    	
    	HashMap<String, String> hs = new HashMap<>();
    	ArrayList<String[]> result = new ArrayList<>();
    	for(int i =0; i<record.length; i++) {
    		String[] input = record[i].split(" ");
    		
    		if(input[0].equals("Enter")) {
    			hs.put(input[1], input[2]);
    			String[] temp = {input[1], "님이 들어왔습니다."};
    			result.add(temp);
    		}else if (input[0].equals("Leave")) {
    			String[] temp = {input[1], "님이 나갔습니다."};
    			result.add(temp);
    		}else if(input[0].equals("Change")) {
    			hs.put(input[1], input[2]);
    		}
    	}
    	
        String[] answer = new String[result.size()];
        for(int i =0; i<answer.length; i++) {
        	StringBuilder sb = new StringBuilder();
        	sb.append(hs.get(result.get(i)[0])).append(result.get(i)[1]);
        	answer[i]=sb.toString();
        }
        return answer;
    }
}