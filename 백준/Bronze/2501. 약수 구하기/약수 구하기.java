import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> xx = new ArrayList<Integer>();

		// 입력된 숫자
		int N = sc.nextInt();
		int K = sc.nextInt();

		// 약수를 xx에 저장
		for (int i = 1; i <= N; i++) {
			if (N % i == 0) {
				xx.add(i);
			}
		}

		// 출력
		if (K <= xx.size()) {
			System.out.println(xx.get(K - 1));
		}else {
			System.out.println(0);
		}
	}
}