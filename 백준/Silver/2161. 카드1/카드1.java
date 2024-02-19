import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		StringBuilder answer = new StringBuilder();
		Queue<Integer> cards = new LinkedList<>();
		for(int i=1; i<=n; i++) {
			cards.add(i);
		}
		
		while(cards.size()!=1) {
			answer.append(cards.poll()+" ");
			cards.add(cards.poll());
		}
		
		answer.append(cards.poll());
		System.out.println(answer.toString());
	}
}