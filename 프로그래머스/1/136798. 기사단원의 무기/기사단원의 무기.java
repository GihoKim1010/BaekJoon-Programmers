public class Solution {

	public int weapon(int x) {
		int count = 0;
		for (int i = 1; i * i <= x; i++) {
			if (x % i == 0) {
				if (i * i == x) {
					count++;
				} else {
					count += 2;
				}
			}
		}
		return count;
	}

	public int solution(int number, int limit, int power) {
		int answer = 0;
		for(int i=1; i<=number; i++) {
			if(weapon(i)>limit) {
				answer+=power;
			}else {
				answer+=weapon(i);
			}
		}
		return answer;
	}
}