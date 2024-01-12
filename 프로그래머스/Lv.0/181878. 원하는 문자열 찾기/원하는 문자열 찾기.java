public class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        
        StringBuilder strA = new StringBuilder();
        for(int i=0; i<myString.length(); i++) {
        	char tempA = myString.charAt(i);
        		if(Character.isLowerCase(tempA)) {
        			strA.append(Character.toUpperCase(tempA));
        		}else {
        			strA.append(tempA);
        		}
        }
        String resultA=strA.toString();
        
        StringBuilder strB = new StringBuilder();
        for(int i=0; i<pat.length(); i++) {
        	char tempB = pat.charAt(i);
        		if(Character.isLowerCase(tempB)) {
        			strB.append(Character.toUpperCase(tempB));
        		}else {
        			strB.append(tempB);
        		}
        }
        String resultB=strB.toString();
        
        if(resultA.contains(resultB)) {
        	answer=1;
        }
        
        return answer;
    }
}