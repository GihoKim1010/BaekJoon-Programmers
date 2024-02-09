import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		Deque<String> de = new LinkedList<>();
		StringBuilder result = new StringBuilder();

		boolean isClosed = true;
		for (int i = 0; i < input.length(); i++) {
			String temp = String.valueOf(input.charAt(i));
			de.addLast(temp);
			if (temp.equals(">")) {
				while (!de.isEmpty()) {
					result.append(de.pollFirst());
				}
				isClosed=true;
			} else if (temp.equals(" ") && isClosed) {
				String temp2 = de.pollLast();
				while (!de.isEmpty()) {
					result.append(de.pollLast());
				}
				result.append(temp2);
			}else if (temp.equals("<")) {
				isClosed = false;
				String temp2 = de.pollLast();
				while (!de.isEmpty()) {
					result.append(de.pollLast());
				}
				result.append(temp2);
			}
		}
		while (!de.isEmpty()) {
			result.append(de.pollLast());
		}
		System.out.println(result.toString());
	}
}