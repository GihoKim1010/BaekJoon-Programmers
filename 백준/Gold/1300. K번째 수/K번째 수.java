import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		long N = sc.nextInt();
		long k = sc.nextInt();

		long min = 1;
		long max = k;
		long x = 0;
		
		while (min < max) {
			x = (min + max) / 2;
			int count = 0;
			for (int i = 1; i <= N; i++) {
				count+=Math.min(x/i, N);
				if (x / i == 0) {
					break;
				}
			}

			if (count < k) {
				min = x+1;
			} else {
				max = x;
			}
		}

		System.out.println(min);
	}
}