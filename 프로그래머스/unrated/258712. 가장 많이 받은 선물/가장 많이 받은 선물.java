import java.util.Arrays;
import java.util.HashMap;

public class Solution {
    public int solution(String[] friends, String[] gifts) {
        
        
        HashMap<String, Integer> hs = new HashMap<>();
        for(int i =0; i<friends.length; i++) {
        	hs.put(friends[i], i);
        }
        
        int[][] arr = new int[friends.length][friends.length];
        int[] num = new int[friends.length]; 
        int[] result = new int[friends.length];
        
        for(int i=0; i<gifts.length; i++) {
        	String[] temp = gifts[i].split(" ");
        	arr[hs.get(temp[0])][hs.get(temp[1])]++;
        	num[hs.get(temp[0])]++;
        	num[hs.get(temp[1])]--;
        }
        
        for(int i=0; i<friends.length; i++) {
        	for (int j=0; j<=i; j++) {
        		if(arr[i][j]>arr[j][i]) {
        			result[i]++;
        		}else if(arr[i][j]<arr[j][i]) {
        			result[j]++;
        		}else if(arr[i][j]==arr[j][i]) {
        			if(num[i]>num[j]) {
        				result[i]++;
        			}else if(num[j]>num[i]) {
        				result[j]++;
        			}
        		}
        	}
        }
        
        Arrays.sort(result);
        int answer = result[result.length-1];
        
        return answer;
    }
}