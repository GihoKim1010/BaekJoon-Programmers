import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// M,N 입력받음
		int M = sc.nextInt();
		int N = sc.nextInt();

		// M~N에 대해 소수 여부 판정하여 소수일 경우 list에 넣음.
		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = M; i <= N; i++) {

			int judge = 0; // 약수가 있으면 값을 변경시킴. judge가 0이면 약수가 없다는뜻.

			for (int j = 2; j < i; j++) {
				if (i % j == 0 && i != 2) { // 2는 소수인데, i=j=2일경우 i%j=0 되므로 고려해줌.
					judge = judge + 1;
				}
			}
			if (i == 1) { // 1을 제외
				judge = judge + 1;
			}

			if (judge == 0) {
				list.add(i);
			}
		}

		// 출력
		if (list.size() == 0) {
			System.out.println(-1);
		} else {
			int sum = 0;
			for (int x : list) {
				sum += x;
			}
			System.out.println(sum);
			System.out.println(list.get(0));
		}
	}
}