import java.util.Arrays;

public class Solution {
	public int solution(int[] A, int[] B) {
		int answer = 0;
		Arrays.sort(A);
		Arrays.sort(B);
		for(int i=0; i<A.length; i++) {
			answer += A[A.length-i-1]*B[i];
		}
		
		return answer;
	}
}