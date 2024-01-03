import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int x = 0;
		int y = 0;

		loop_a:
		for (int i = N / 5; i >= 0; i--) {
			for (int j = 0; j <= N - (5 * i); j++) {
				if ((5 * i) + (3 * j) == N) {
					x=i;
					y=j;
					break loop_a;
				}else {
					x=-1;
				}
			}
		}
		System.out.println(x+y);
	}
}