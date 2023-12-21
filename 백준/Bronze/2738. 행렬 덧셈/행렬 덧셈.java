import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 첫째줄에 N, M 입력
		String firstLine = sc.nextLine();
		String[] sp_FirstLine = firstLine.split(" ");
		int N = Integer.parseInt(sp_FirstLine[0]);
		int M = Integer.parseInt(sp_FirstLine[1]);

		// 각 행렬을 저장할 배열 A,B와 그 합을 저장할 C 생성
		int[] A = new int[N * M];
		int[] B = new int[N * M];
		int[] C = new int[N * M];

		// A와 B에 값을 저장
		for (int i = 0; i < N; i++) {
			String otherLines = sc.nextLine();
			String[] sp_otherLines = otherLines.split(" ");
			for (int j = 0; j < M; j++) {
				A[(i * M) + j] = Integer.parseInt(sp_otherLines[j]);
			}
		}

		for (int i = 0; i < N; i++) {
			String otherLines = sc.nextLine();
			String[] sp_otherLines = otherLines.split(" ");
			for (int j = 0; j < M; j++) {
				B[(i * M) + j] = Integer.parseInt(sp_otherLines[j]);
			}
		}

		// C에 값을 저장
		for (int i = 0; i < N * M; i++) {
			C[i] = A[i] + B[i];
		}

		// 출력
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				System.out.print(C[(i*M)+j]+" ");
			}
			System.out.println();
		}
	}
}