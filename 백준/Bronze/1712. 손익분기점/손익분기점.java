import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// A : 연 단위 고정지출 , B : 생산 갯수당 지출 , C : 판매가격
		long A = sc.nextLong(), B = sc.nextLong(), C = sc.nextLong();

		if (C - B <= 0) {
			System.out.println(-1);
		} else {
			long min = (long) (A / (C - B)) + 1;
			System.out.println(min);
		}
	}
}