import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 행렬 생성.
		String[][] xx = new String[5][15];

		// 행렬에 값 대입.
		for (int i = 0; i < 5; i++) {
			String insert = sc.nextLine();

			for (int j = 0; j < insert.length(); j++) {
				char character = insert.charAt(j);
				xx[i][j] = String.valueOf(character);
			}
		}

		// 출력
		for (int j = 0; j < 15; j++) {
			for (int i = 0; i < 5; i++) {
				if (xx[i][j] != null) {
					System.out.print(xx[i][j]);
				}
			}
		}
	}
}