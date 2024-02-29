import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		PriorityQueue<Integer> cards = new PriorityQueue<>();
		
		for(int i=0; i<n; i++) {
			cards.add(sc.nextInt());
		}
		
		long sum=0;
		for(int i=0; i<n-1; i++) {
			int partSum = cards.poll()+cards.poll();
			sum+=partSum;
			cards.add(partSum);
		}
		System.out.println(sum);
	}
}