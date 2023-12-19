import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 학생 30명을 뜻하는 배열 list를 생성.
		int[] list = new int[30];
		for (int a = 0; a < 30; a++) {
			list[a] = a + 1;
		}

		// 제출한 학생의 번호를 받을 배열 submit을 생성.
		int[] submit = new int[28];

		// 제출한 출석번호를 28번 받음
		for (int b = 0; b < 28; b++) {
			int n = sc.nextInt();

			// 출석번호 n번이 제출했을 경우, list에서 해당 값을 0으로 만듦.
			for (int c = 0; c < 30; c++) {
				if (list[c] == n) {
					list[c] = 0;
				}
			}
		}

		// 0을 제외하고 출력
		for (int x = 0; x < 30; x++) {
			if (list[x] != 0) {
				System.out.print(list[x] + " ");
			}
		}
	}
}