import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int dasom = sc.nextInt();
		
		PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
		for(int i=0; i<n-1; i++) {
			pq.add(sc.nextInt());
		}
		
		int count=0;
		
		while(!pq.isEmpty()) {
			int max = pq.poll();
			if(dasom<=max) {
				max--;
				count++;
				dasom++;
				pq.add(max);
			}else {
				break;
			}
		}
		System.out.println(count);
	}
}