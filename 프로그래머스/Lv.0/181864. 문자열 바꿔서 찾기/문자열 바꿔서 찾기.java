public class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        
        myString=myString.replace("A", "e");
        myString=myString.replace("B", "A");
        myString=myString.replace("e", "B");
        
        if(myString.contains(pat)) {
        	answer=1;
        }
        return answer;
    }
}