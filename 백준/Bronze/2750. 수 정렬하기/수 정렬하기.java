import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] result = new int[N];

		for (int i = 0; i < N; i++) {
			result[i] = sc.nextInt();
		}

		Arrays.sort(result);

		System.out.println(result[0]);
		
		for (int i = 0; i < N-1; i++) {
			if (result[i] != result[i + 1]) {
				System.out.println(result[i+1]);
			}
		}
	}
}