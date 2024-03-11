import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String input = sc.nextLine();
		StringBuilder result = new StringBuilder();
		Stack<Character> st = new Stack<>();
		
		for (int i = 0; i < input.length(); i++) {
			char now = input.charAt(i);

			switch (now) {
			case '+':
			case '-':
			case '*':
			case '/':
				while (!st.isEmpty() && priority(st.peek()) >= priority(now)) {
					result.append(st.pop());
				}
				st.add(now);
				break;
			case '(':
				st.add(now);
				break;
			case ')':
				while(!st.isEmpty() && st.peek()!='(') {
					result.append(st.pop());
				}
				st.pop();
				break;
			default:
				result.append(now);
			}

		}
		
		while(!st.isEmpty()) {
			result.append(st.pop());
		}

		System.out.println(result.toString());
	}

	public static int priority(char now) {
		if (now == '(' || now == ')') {
			return 0;
		} else if (now == '+' || now == '-') {
			return 1;
		} else {
			return 2;
		}
	}
}