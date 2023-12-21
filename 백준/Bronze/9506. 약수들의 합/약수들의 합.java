import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 결과를 저장할 ArrayList
		ArrayList<String> result = new ArrayList<String>();

		// 테스트 케이스 입력
		while (true) {
			int n = sc.nextInt();

			// 마지막줄에 -1이 오면 종료됨.
			if (n <= 2) {
				break;
			}

			// 약수를 전부 구하여 ArrayList num에 저장.
			ArrayList<Integer> num = new ArrayList<Integer>();

			for (int i = 1; i < n; i++) {
				if (n % i == 0) {
					num.add(i);
				}
			}

			// 약수의 합계
			int sum = 0;

			for (int x : num) {
				sum += x;
			}

			// 완전수 여부 판별하여 result에 저장
			String a = n + " = ";
			if (sum == n) {

				for (int i = 0; i < num.size() - 1; i++) {
					a = a + num.get(i) + " + ";
				}
				a = a + num.get(num.size() - 1);
			} else {
				a =n + " is NOT perfect.";
			}
			result.add(a);
		}
		
		//출력
		for(String x:result) {
			System.out.println(x);
		}
	}
}