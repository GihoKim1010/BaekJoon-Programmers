import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		PriorityQueue<Integer> qu = new PriorityQueue<>(Comparator.reverseOrder());
		StringBuilder result = new StringBuilder();

		for (int i = 0; i < n; i++) {
			int input = sc.nextInt();
			if (input != 0) {
				qu.add(input);
			} else {
				if (qu.isEmpty()) {
					result.append("0" + "\n");
				} else {
					result.append(qu.poll() + "\n");
				}
			}
		}
		System.out.println(result.toString());
	}
}