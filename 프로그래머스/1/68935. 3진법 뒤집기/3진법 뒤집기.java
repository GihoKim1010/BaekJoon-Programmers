import java.util.LinkedList;
import java.util.Queue;

public class Solution {
	public long solution(int n) {

		Queue<Integer> qu = new LinkedList<>();
		while (n > 0) {
			qu.add(n % 3);
			n /= 3;
		}

		long x = 0;
		while (!qu.isEmpty()) {
			x += qu.poll();
			x *= 10;
		}
		x /= 10;
		System.out.println(x);

		long index = 0;
		long answer = 0;
		while (x != 0) {
			long temp = x % 10;
			answer += temp * Math.pow(3, index);
			x /= 10;
			index++;
		}
		return answer;
	}
}