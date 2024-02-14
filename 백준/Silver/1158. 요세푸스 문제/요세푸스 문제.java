import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), k = sc.nextInt();
		Queue<Integer> people = new LinkedList<>();
		for (int i = 1; i <= n; i++) {
			people.add(i);
		}
		StringBuilder answer = new StringBuilder();
		answer.append("<");
		while (!people.isEmpty()) {
			for (int i = 0; i < k - 1; i++) {
				people.add(people.poll());
			}
			if (people.size() != 1) {
				answer.append(people.poll() + ", ");
			}else {
				answer.append(people.poll());
			}
		}
		answer.append(">");
		System.out.println(answer.toString());
	}
}