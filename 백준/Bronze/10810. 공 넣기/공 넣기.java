import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 첫번째줄 공백 기준 분리 후 int로 변환
		String first = sc.nextLine();
		String[] NM = first.split(" ");
		int[] int_NM = new int[NM.length];

		for (int i = 0; i < NM.length; i++) {
			int_NM[i] = Integer.parseInt(NM[i]);
		}

		// N과 M값 지정
		int N = int_NM[0];
		int M = int_NM[1];

		// 바구니 N개를 뜻할 배열 basket 생성 후 기본값으로 0 지정.
		int[] basket = new int[N];
		for (int a = 0; a < N; a++) {
			basket[a] = 0;
		}

		// 세번째 줄부터 다시 공백 기준 분리 후 int 변환 (여기서 바구니 처리부터 해야함.)

		for (int l = 0; l < M; l++) {
			String putIn = sc.nextLine();
			String[] st_PutIn = putIn.split(" ");
			int[] int_PutIn = new int[st_PutIn.length];

			for (int m = 0; m < st_PutIn.length; m++) {
				int_PutIn[m] = Integer.parseInt(st_PutIn[m]);

				// i j k 지정
				int i = int_PutIn[0];
				int j = int_PutIn[1];
				int k = int_PutIn[2];

				// 여기다 만들어야함. 바구니에 넣는 과정.
				for (int n = i - 1; n <= j - 1; n++) {
					basket[n] = k;
				}

			}
		}
		//출력
		for (int b = 0; b < N; b++) {
			System.out.print(basket[b] + " ");
		}
	}
}