import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m=sc.nextInt();
		PriorityQueue<Long> cards = new PriorityQueue<>();
		
		for(int i=0; i<n; i++) {
			cards.add(sc.nextLong());
		}
		
		for(int i=0; i<m; i++) {
			long partSum = cards.poll()+cards.poll();
			cards.add(partSum);
			cards.add(partSum);
		}
		
		long sum=0;
		for(int i=0; i<n; i++) {
			sum+=cards.poll();
		}
		System.out.println(sum);
	}
}