import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		long answer = 0;
		int broken = sc.nextInt();
		int num = sc.nextInt();

		switch (broken) {
		case 1:
			answer = (long) 8 * num;
			break;
		case 2:
			if (num % 2 == 1) {
				answer = (long) 4 * num + 3;
			} else {
				answer = (long) 4 * num + 1;
			}
			break;
		case 3:
			answer = (long) 4 * num + 2;
			break;
		case 4:
			if (num % 2 == 1) {
				answer = (long) 4 * num + 1;
			} else {
				answer = (long) 4 * num + 3;
			}
			break;
		case 5:
			answer = (long) 8 * num + 4;
			break;
		}

		System.out.println(answer);
	}
}