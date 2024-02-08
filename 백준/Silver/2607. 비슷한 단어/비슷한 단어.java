import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		sc.nextLine();
		HashMap<String, Integer> judge = new HashMap<>();
		String first = sc.nextLine();
		for (int i = 0; i < first.length(); i++) {
			String x = String.valueOf(first.charAt(i));
			judge.put(x, judge.getOrDefault(x, 0) + 1);
		}

		int answer = 0;
		for (int i = 0; i < n - 1; i++) {
			HashMap<String, Integer> hs = (HashMap<String, Integer>) judge.clone();
			String input = sc.nextLine();
			for (int j = 0; j < input.length(); j++) {
				String y = String.valueOf(input.charAt(j));
				hs.put(y, hs.getOrDefault(y, 0) - 1);
			}
			boolean isSame = true;
			int minus = 0;
			int plus = 0;
			for (int x : hs.values()) {
				if (x <= -2 || x >= 2) {
					isSame = false;
				} else if (x == -1) {
					minus++;
				} else if (x == 1) {
					plus++;
				}
			}
			
			if(minus>1 || plus>1) {
				isSame=false;
			}
			if (isSame) {
				answer++;
			}
		}
		System.out.println(answer);
	}
}