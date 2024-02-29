import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m =sc.nextInt();
		
		//양수와 음수를 따로저장
		PriorityQueue<Integer> plus = new PriorityQueue<>(Collections.reverseOrder());
		PriorityQueue<Integer> minus = new PriorityQueue<>(Collections.reverseOrder());
		
		for(int i=0; i<n; i++) {
			int input = sc.nextInt();
			if(input>0) {
				plus.add(input);
			}else {
				minus.add(Math.abs(input));
			}
		}
		
		//가장 먼곳을 왕복하지 않도록 값을 저장(왕복 시킨 후 그 값만큼 뺄예정)
		int end=0;
		if(plus.isEmpty()) {
			end=minus.peek();
		}else if(minus.isEmpty()) {
			end=plus.peek();
		}else if(plus.peek()>=minus.peek()) {
			end=plus.peek();
		}else {
			end=minus.peek();
		}
		
		//오름차순으로 정리된 plus, minus들에서 m개씩 poll한 후, 가장 큰 첫값을 왕복시킴.
		int distance=0;
		while(!plus.isEmpty()) {
			distance+=2*plus.peek();
			
			for(int i=0; i<m; i++) {
				if(!plus.isEmpty()) {
					plus.poll();
				}
			}
		}
		
		while(!minus.isEmpty()) {
			distance+=2*minus.peek();
			
			for(int i=0; i<m; i++) {
				if(!minus.isEmpty()) {
					minus.poll();
				}
			}
		}
		
		distance-=end;
		System.out.println(distance);
	}
}