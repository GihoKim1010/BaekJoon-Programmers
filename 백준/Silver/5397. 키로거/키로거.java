import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		sc.nextLine();

		StringBuilder answer = new StringBuilder();
		for (int i = 0; i < t; i++) {
			String input = sc.nextLine();
			int length = input.length();

			Deque<String> result = new LinkedList<>();
			Stack<String> tempSave = new Stack<>();

			for (int j = 0; j < length; j++) {
				String pressKey = String.valueOf(input.charAt(j));
				switch (pressKey) {
				case "<":
					if (!result.isEmpty()) {
						tempSave.add(result.pollLast());
					}
					break;
				case ">":
					if (!tempSave.isEmpty()) {
						result.addLast(tempSave.pop());
					}
					break;
				case "-":
					if (!result.isEmpty()) {
						result.pollLast();
					}
					break;
				default:
					result.addLast(pressKey);
					break;
				}
			}
			while (!result.isEmpty()) {
				answer.append(result.pollFirst());
			}
			while (!tempSave.isEmpty()) {
				answer.append(tempSave.pop());
			}
			answer.append("\n");
		}
		System.out.println(answer.toString());
	}
}