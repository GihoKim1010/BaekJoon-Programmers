import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count = 0;
		int K = 1;

		while (N != 0) {
			if (N < K) {
				K = 1;
			}
			N -= K;
			K++;
			count++;
		}
		System.out.println(count);
	}
}