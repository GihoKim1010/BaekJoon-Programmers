import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 첫째줄에 주는 값 N 저장.
		int N = sc.nextInt();
		// 개행문자 소비
		sc.nextLine();

		// 두번째 줄 스플릿하여 점수 각각 score[]에 저장.
		double [] score = new double[N];
		String insert = sc.nextLine();
		String[] sp_Insert = insert.split(" ");
		for (int i = 0; i < sp_Insert.length; i++) {
			score[i] = Double.parseDouble(sp_Insert[i]);
		}

		// 최고점 best 선정.
		double best = score[0];
		for (int i = 0; i < N - 1; i++) {
			if (best < score[i + 1]) {
				best = score[i + 1];
			}
		}

		// 계산값을 새로운 배열 newScore[]에 저장.
		double[] newScore = new double[N];
		for (int i = 0; i < N; i++) {
			newScore[i] = (score[i] / best) * 100;
		}

		// newScore의 합계.
		double newSum = 0;

		for (int i = 0; i < N; i++) {
			newSum = newSum+newScore[i];
		}
		
		//평균출력
		System.out.println(newSum/N);
	}
}