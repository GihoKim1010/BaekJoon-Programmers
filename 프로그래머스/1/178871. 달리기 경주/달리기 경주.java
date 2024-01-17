import java.util.HashMap;

public class Solution {
    public String[] solution(String[] players, String[] callings) {
        
        HashMap<String, Integer> hs = new HashMap<>();
        for(int i =0; i<players.length; i++) {
        	hs.put(players[i], i);
        }
        
        for(int i=0; i<callings.length; i++) {
        	String temp = players[hs.get(callings[i])];
        	String temp2 = players[hs.get(callings[i])-1];
        	players[hs.get(callings[i])]=temp2;
        	players[hs.get(callings[i])-1]=(temp);
        	hs.replace(temp, hs.get(temp)-1);
        	hs.replace(temp2, hs.get(temp2)+1);
        }
        String[] answer = players;
        
        return answer;
    }
}