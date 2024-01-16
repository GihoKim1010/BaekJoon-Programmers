public class Solution {
	
	public int solution(int n) {

		long answer =0;
		if (n % 2 == 1) {
			answer = 0;
		} else if (n == 2) {
			answer = 3;
		} else if (n % 2 == 0) {
			long[] ar = new long[n / 2 +1];
			ar[0] = 1;
			ar[1] = 3;
			if (n >= 4) {
				for(int i=2; i<n/2+1; i++) {
					ar[i]=(4*ar[i-1]-ar[i-2]+1000000007L)%1000000007L;
				}
				answer = ar[n/2]%1000000007L;
			}
		}

		return (int)answer;
	}
}