import java.util.Scanner;

public class Main {

	public static int turn(int a) {
		int answer = 0;
		if (a == 0) {
			answer = 1;
		} else if (a == 1) {
			answer = 0;
			;
		}
		return answer;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		int[] button = new int[T + 1];
		for (int i = 1; i <= T; i++) {
			button[i] = sc.nextInt();
		}

		int a = sc.nextInt();
		for (int i = 0; i < a; i++) {
			int gender = sc.nextInt();
			int x = sc.nextInt();

			if (gender == 1) {
				for (int j = 1; x * j <= T; j++) {
					button[x * j] = turn(button[x * j]);
				}
			} else {
				button[x] = turn(button[x]);
				int k = 1;
				while (x - k >= 1 && x + k <= T && button[x - k] == button[x + k]) {
					button[x - k] = turn(button[x - k]);
					button[x + k] = turn(button[x + k]);
					k++;
				}
			}
		}
		int count = 0;
		for (int i = 1; i <= T; i++) {
			count++;
			if (count == 21) {
				System.out.println();
				count=1;
			}
			System.out.print(button[i] + " ");
		}
	}
}