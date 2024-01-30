import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] A = new int[N];

		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		ArrayList<Integer> B = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			B.add(sc.nextInt());
		}

		Arrays.sort(A);
		Collections.sort(B, Comparator.reverseOrder());
		
		int S=0;
		for(int i=0; i<N; i++) {
			S+=(A[i]*B.get(i));
		}
		
		System.out.println(S);
	}

}