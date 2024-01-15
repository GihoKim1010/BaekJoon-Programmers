import java.math.BigInteger;

public class Solution {
    public String solution(String a, String b) {
    	
    	BigInteger x=new BigInteger(a);
    	BigInteger y=new BigInteger(b);
    	BigInteger z=x.add(y);
    	
        String answer = String.valueOf(z);
        return answer;
    }
}