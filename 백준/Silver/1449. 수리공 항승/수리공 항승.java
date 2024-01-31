import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int L = sc.nextInt();
		int[] where = new int[N];

		for (int i = 0; i < N; i++) {
			where[i] = sc.nextInt();
		}

		Arrays.sort(where);

		if (N == 1) {
			System.out.println(1);
		} else {
			int start = where[0];
			int count = 1;
			for (int i = 0; i < N; i++) {
				if(where[i]-start+1>L) {
					start=where[i];
					count++;
				}
			}
			System.out.println(count);
		}

	}
}