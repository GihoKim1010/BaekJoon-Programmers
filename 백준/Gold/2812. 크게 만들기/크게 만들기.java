import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), k = sc.nextInt();
		sc.nextLine();
		String input = sc.nextLine();
		StringBuilder number = new StringBuilder(input);

		// 앞에서 k개의 숫자 중 가장 큰값의 위치
		int maxFront = 0;
		for (int i = 0; i < k; i++) {
			if (number.charAt(maxFront) < number.charAt(i + 1)) {
				maxFront = i + 1;
			}
		}
		k -= maxFront;
		number.replace(0, maxFront, "");

		Deque<Integer> de = new LinkedList<>();
		for (int i = 0; i < number.length(); i++) {
			int now = number.charAt(i) - '0';
			if (de.isEmpty() || k <= 0) {
				de.addLast(now);
			} else {
				while (true) {
					if (de.isEmpty() || de.peekLast() >= now) {
						de.addLast(now);
						break;
					} else {
						int x =de.pollLast();
						k-=1;
					}
					
					if(k<=0) {
						de.addLast(now);
						break;
					}
				}
			}
		}
		StringBuilder answer = new StringBuilder();
		int size = de.size();
		for (int i = 0; i < size-k; i++) {
			answer.append(de.pollFirst());
		}
		System.out.println(answer.toString());
	}
}