import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), k=sc.nextInt();
		PriorityQueue<int[]> jewelry = new PriorityQueue<>(Comparator.<int[], Integer>comparing(ar->ar[0]).thenComparing(ar->ar[1], Comparator.reverseOrder()));
		int[] bags = new int[k];
		
		for(int i=0; i<n; i++) {
			int m=sc.nextInt(), v=sc.nextInt();
			jewelry.add(new int[] {m,v});
		}
		
		for(int i=0; i<k; i++) {
			bags[i]=sc.nextInt();
		}
		
		Arrays.sort(bags);
		
		long sum =0;
		PriorityQueue<Integer> values = new PriorityQueue<>(Comparator.reverseOrder());
		for(int i=0; i<k; i++) {
			while(!jewelry.isEmpty()) {
				int weight = jewelry.peek()[0];
				if(weight<=bags[i]) {
					values.add(jewelry.poll()[1]);
				}else {
					break;
				}
			}
			if(!values.isEmpty()) {
				sum+=values.poll();
			}
		}
		
		System.out.println(sum);
	}
}