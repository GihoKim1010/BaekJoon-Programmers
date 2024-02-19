import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), k = sc.nextInt();
		boolean[] judge = new boolean[n + 1];
		int answer = 0, num = 0;
		loop_a: for (int i = 2; i <= n; i++) {
			if (!judge[i]) {
				for (int j = 1; j * i <= n; j++) {
					if (!judge[i * j]) {
						judge[i * j] = true;
						num++;
					}
					if (num == k) {
						answer = i * j;
						break loop_a;
					}
				}
			}
		}
		System.out.println(answer);
	}
}