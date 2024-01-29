import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long n = Long.parseLong(sc.nextLine());
		long temp = n;
		long answer = 1L;

		for (long i = 2; i * i <= n; i++) {
			if (temp < i) {
				break;
			}

			if (temp % i == 0) {
				long count = 0L;
				while (temp % i == 0) {
					temp /= i;
					count++;
				}
				answer *= (i - 1) * Math.pow(i, count - 1);
			}
		}
		if (temp != 1) {
			answer *= (temp - 1);
		}
		if (n == 1) {
			answer = 1;
		}

		System.out.println(answer);
	}
}