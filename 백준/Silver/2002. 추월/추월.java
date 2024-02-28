import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();

		// 터널에 들어갈 당시의 순서를 저장
		HashMap<String, Integer> order = new HashMap<>();
		for (int i = 0; i < n; i++) {
			String car = sc.nextLine();
			order.put(car, i);
		}

		// 순서 변동을 검사하기 위한 배열
		int[] later = new int[n];
		for (int i = 0; i < n; i++) {
			String car = sc.nextLine();
			later[i] = order.get(car);
		}
		int count = 0;
		for (int i = 0; i < n - 1; i++) {
			for (int j = i+1; j < n; j++) {
				if (later[i] > later[j]) {
					count++;
					break;
				}
			}
		}
		System.out.println(count);
	}
}