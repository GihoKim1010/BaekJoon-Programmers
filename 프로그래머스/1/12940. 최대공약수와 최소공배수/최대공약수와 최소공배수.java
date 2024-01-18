class Solution {
	public static int findGCD(int a, int b) {
	      while(b !=0) {
	            int temp=b;
	            b=a%b;
	             a =temp;
	       }
	       return a;
	}
	
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        answer[0]=findGCD(n,m);
        answer[1]=n*m/findGCD(n,m);
        return answer;
    }
}