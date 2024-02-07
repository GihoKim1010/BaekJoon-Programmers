import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static int romanToDecimal(String input) {

		int answer = 0;
		Queue<String> qu = new LinkedList<>();
		for (int i = 0; i < input.length(); i++) {
			qu.add(String.valueOf(input.charAt(i)));
		}

		while (!qu.isEmpty()) {
			String x = qu.poll();
			if (x.equals("M")) {
				answer += 1000;
			} else if (x.equals("D")) {
				answer += 500;
			} else if (x.equals("L")) {
				answer += 50;
			} else if (x.equals("V")) {
				answer += 5;
			} else if (x.equals("C")) {
				if (!qu.isEmpty()) {
					if (qu.peek().equals("M")) {
						qu.poll();
						answer += 900;
					} else if (qu.peek().equals("D")) {
						qu.poll();
						answer += 400;
					} else {
						answer += 100;
					}
				} else {
					answer += 100;
				}
			} else if (x.equals("X")) {
				if (!qu.isEmpty()) {
					if (qu.peek().equals("C")) {
						qu.poll();
						answer += 90;
					} else if (qu.peek().equals("L")) {
						qu.poll();
						answer += 40;
					} else {
						answer += 10;
					}
				} else {
					answer += 10;
				}
			} else if (x.equals("I")) {
				if (!qu.isEmpty()) {
					if (qu.peek().equals("X")) {
						qu.poll();
						answer += 9;
					} else if (qu.peek().equals("V")) {
						qu.poll();
						answer += 4;
					} else {
						answer += 1;
					}
				} else {
					answer += 1;
				}
			}
		}
		return answer;
	}

	public static String decimalToRoman(int sum) {
		StringBuilder result = new StringBuilder();

		int one = sum % 10;
		int ten = (sum / 10) % 10;
		int hundred = (sum / 100) % 10;
		int thousand = sum / 1000;

		if (thousand != 0) {
			for (int i = 0; i < thousand; i++) {
				result.append("M");
			}
		}

		if (hundred != 0) {
			result.append(zeroToNine(hundred, "C", "D", "M"));
		}

		if (ten != 0) {
			result.append(zeroToNine(ten, "X", "L", "C"));
		}

		if (one != 0) {
			result.append(zeroToNine(one, "I", "V", "X"));
		}
		return result.toString();
	}

	public static String zeroToNine(int x, String a, String b, String c) {
		StringBuilder result = new StringBuilder();
		if (x == 1) {
			result.append(a);
		} else if (x == 2) {
			result.append(a).append(a);
		} else if (x == 3) {
			result.append(a).append(a).append(a);
		} else if (x == 4) {
			result.append(a).append(b);
		} else if (x == 5) {
			result.append(b);
		} else if (x == 6) {
			result.append(b).append(a);
		} else if (x == 7) {
			result.append(b).append(a).append(a);
		} else if (x == 8) {
			result.append(b).append(a).append(a).append(a);
		} else if (x == 9) {
			result.append(a).append(c);
		}
		return result.toString();
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String inputA = sc.nextLine();
		String inputB = sc.nextLine();

		System.out.println(romanToDecimal(inputA) + romanToDecimal(inputB));
		System.out.println(decimalToRoman(romanToDecimal(inputA) + romanToDecimal(inputB)));
	}
}