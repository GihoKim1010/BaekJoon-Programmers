import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		StringBuilder answer = new StringBuilder();

		for (int i = 0; i < T; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			int C = sc.nextInt();
			int D = sc.nextInt();

			while(D>0) {
				if(A>=B && A>=C) {
					A--;
				}else if(B>A && B>=C) {
					B--;
				}else {
					C--;
				}
				D--;
			}
			
			BigInteger result = BigInteger.ONE;
			result = result.multiply(BigInteger.valueOf(A));
			result = result.multiply(BigInteger.valueOf(B));
			result = result.multiply(BigInteger.valueOf(C));

			answer.append(result).append("\n");
		}

		System.out.println(answer.toString());
	}
}