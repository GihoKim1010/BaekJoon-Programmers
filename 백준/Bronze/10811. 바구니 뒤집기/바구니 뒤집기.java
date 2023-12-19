import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 입력한 첫번째 숫자들을 분리하여 N, M 값을 지정.
		int N = 0;
		int M = 0;

		String firstLine = sc.nextLine();
		String[] spFirstLine = firstLine.split(" ");
		N=Integer.parseInt(spFirstLine[0]);
		M=Integer.parseInt(spFirstLine[1]);

		// 바구니를 뜻할 배열 basket 생성.
		int[] basket = new int[N];
		for (int i = 0; i < N; i++) {
			basket[i] = i + 1;
		}

		// M번 입력받은 i,j 값을 배열에 저장.
		int i = 0;
		int j = 0;

		for (int k = 0; k < M; k++) {
			String otherLine = sc.nextLine();
			String[] spOtherLine = otherLine.split(" ");
				i = Integer.parseInt(spOtherLine[0]);
				j = Integer.parseInt(spOtherLine[1]);

				// 바구니를 뒤집음.
				int temp = 0;
				for (int m = 0; m < (j - i + 1) / 2; m++) {
					temp = basket[i + m - 1];
					basket[i + m - 1] = basket[j - m - 1];
					basket[j - m - 1] = temp;
				}
			}
		for (int l = 0; l < N; l++) {
			System.out.print(basket[l] + " ");
		}
	}
}