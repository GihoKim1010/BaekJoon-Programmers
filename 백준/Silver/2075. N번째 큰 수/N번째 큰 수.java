import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		PriorityQueue<Integer> qu = new PriorityQueue<>();
		
		for(int i=0; i<n*n; i++) {
			int inputNum = sc.nextInt();
			if(qu.size()==n) {
				int peekedNum = qu.peek();
				if(peekedNum<inputNum) {
					qu.poll();
					qu.add(inputNum);
				}
			}else {
				qu.add(inputNum);
			}
		}
		System.out.println(qu.poll());
	}
}