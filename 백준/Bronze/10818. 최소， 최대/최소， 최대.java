import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 첫째줄 N과 X로 분리 (int_NX[0]=N, [1]=X)
		int N = sc.nextInt();
		sc.nextLine(); // 개행문자 소비

		// x, y 는 둘째 줄을 공백 기준으로 분리하여 int 형식으로 z배열에 저장하기 위한 임시 배열.
		String x = sc.nextLine();
		String[] y = x.split(" ");
		int count = 0;
		int[] z = new int[y.length];

		for (int i = 0; i < N; i++) {
			z[i] = Integer.parseInt(y[i]);
		}

		// 최소값
		int min = z[0];
		for (int i = 0; i < z.length; i++) {
			if (min > z[i]) {
				min = z[i];
			}
		}

		// 최대값
		int max = z[0];
		for (int i = 0; i < z.length; i++) {
			if (max < z[i]) {
				max = z[i];
			}
		}
		System.out.println(min + " " + max);
	}
}