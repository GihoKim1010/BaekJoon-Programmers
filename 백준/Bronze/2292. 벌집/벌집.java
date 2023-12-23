import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int count = 0;
		int n = 0;
		int X = 2;

		while (true) {
			n = n + 1;
			X = X + 6 * (n - 1);
			count = count + 1;

			if (X > N) {
				break;
			}
		}
		System.out.println(count);
	}
}