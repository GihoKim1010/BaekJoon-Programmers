import java.util.Scanner;

public class Main {

	public static long findGCD(long p, long q) {
		while (q != 0) {
			long temp = q;
			q = p % q;
			p = temp;
		}
		return p;
	}

	public static long findLCM(long p, long q) {
		return p * q / findGCD(p, q);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		long d = sc.nextLong(), p = sc.nextLong(), q = sc.nextLong();

		// p,q의 대소관계 정리
		long max = Math.max(p, q);
		long min = Math.min(p, q);

		// 최소공배수(답의 최댓값에서 이만큼 까지만 탐색)
		long lcm = findLCM(p, q);
		long time = lcm / max;

		// 답의 최댓값 지정
		long calc = ((d / max) + 1) * max;
		long answer = calc;
		
		//금액이 큰 지폐의 갯수가 0미만으로 떨어지지않게 조절
		long countMax = ((d / max) + 1);
		time = Math.min(countMax, time);

		for (int i = 0; i < time; i++) {
			calc -= max;
			while (calc < d) {
				calc += min;
			}
			answer = Math.min(answer, calc);
		}
		System.out.println(answer);

	}
}