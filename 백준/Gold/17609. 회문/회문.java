import java.util.Scanner;

public class Main {

	public static int judge(String input, int left, int right, int count) {
		// 투포인터
		if (count == 2 || left>=right) {
			return count;
		} else if (input.charAt(left) == input.charAt(right)) {
			return judge(input, left + 1, right - 1, count);
		} else {
			count++;
			return Math.min(judge(input, left + 1, right, count), judge(input, left, right - 1, count));
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		StringBuilder result = new StringBuilder();
		int t = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < t; i++) {
		String input = sc.nextLine();
		result.append(judge(input, 0, input.length() - 1, 0)).append("\n");
		}

		System.out.println(result.toString());
	}
}