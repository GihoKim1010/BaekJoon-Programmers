import java.util.Scanner;

public class Main {

	// 유클리드 호제법 사용
	public static int findGCD(int a, int b) {
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// A/B 형태
		int A1 = sc.nextInt();
		int B1 = sc.nextInt();
		int A2 = sc.nextInt();
		int B2 = sc.nextInt();

		int result_B = B1 * B2 / findGCD(B1, B2); // 분모는 최소공배수
		int result_A = ((A1 * B2 + A2 * B1) / findGCD(B1, B2));

		if (findGCD(result_A, result_B) != 1) {
			int newResult_A = result_A / findGCD(result_A, result_B);
			int newResult_B = result_B / findGCD(result_A, result_B);
			System.out.println(newResult_A + " " + newResult_B);
		} else {
			System.out.println(result_A + " " + result_B);
		}
	}
}