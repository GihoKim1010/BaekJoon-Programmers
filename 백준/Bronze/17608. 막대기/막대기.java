import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		Stack<Integer> st = new Stack<>();
		for(int i=0; i<N; i++) {
			st.add(sc.nextInt());
		}
		int count=0;
		int max=0;
		while(!st.isEmpty()) {
			int now =st.pop();
			
			if(now>max) {
				max=now;
				count++;
			}
		}
		System.out.println(count);
	}
}