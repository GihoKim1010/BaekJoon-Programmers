import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		// 강의들을 시작시간순으로, 같다면 끝나는 시간순으로 정렬
		PriorityQueue<int[]> lecture = new PriorityQueue<>(
				Comparator.<int[], Integer>comparing(ar -> ar[0]).thenComparing(ar -> ar[1]));
		PriorityQueue<Integer> endTime = new PriorityQueue<>();

		for (int i = 0; i < n; i++) {
			int s = sc.nextInt(), t = sc.nextInt();
			lecture.add(new int[] { s, t });
		}

		while (!lecture.isEmpty()) {
			int[] now = lecture.poll();

			if (!endTime.isEmpty() && endTime.peek() <= now[0]) {
				endTime.poll();
			}
			endTime.add(now[1]);
		}
		
		System.out.println(endTime.size());
	}
}