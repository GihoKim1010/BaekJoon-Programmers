import java.util.Scanner;

public class Main {

	public static long factorial(int N) {

		if (N == 1) {
			return 1;
		} else {
			return N * factorial(N - 1);
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		if (N == 0) {
			System.out.println(1);
		} else {
			System.out.println(factorial(N));
		}

	}
}