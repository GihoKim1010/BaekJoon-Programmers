import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), n = sc.nextInt();

		int maxA = n / a, maxB = n / b, maxC = n / c;

		int sum = 0, answer = 0;

		for (int i = 0; i <= maxA; i++) {
			sum = i * a;
			if (sum == n) {
				answer = 1;
				break;
			} else {
				for (int j = 0; j <= maxB; j++) {
					sum = i * a + j * b;
					if (sum == n) {
						answer = 1;
						break;
					} else {
						for (int k = 0; k <= maxC; k++) {
							sum = i * a + j * b + k * c;
							if (sum == n) {
								answer = 1;
								break;
							}
						}
					}
				}
			}
		}
		System.out.println(answer);
	}
}