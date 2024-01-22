public class Solution {
	public int solution(int n, int a, int b) {
		int answer = 1;
		a--;
		b--;

		int x = 0;
		while (n >= 1) {
			n /= 2;
			x++;
		}
		
		for(int i=0; i<x; i++) {
			if(Math.min(a, b)%2==0 && Math.abs(a-b)==1) {
				break;
			}else {
				a/=2;
				b/=2;
				answer++;
			}
		}

		return answer;
	}
}