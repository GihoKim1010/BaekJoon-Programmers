import java.util.Scanner;
import java.util.Stack;


public class Main {

	static class People{
		int height;
		int count;
		
		People(int height, int count) {
			this.height=height;
			this.count=count;
		}
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Stack<People> st = new Stack<>();
		long sum=0;
		
		for(int i=0; i<n; i++) {
			int now = sc.nextInt();
			People people = new People(now, 1);
			
			while(!st.isEmpty() && st.peek().height<=now) {
				People poped = st.pop();
				sum+=poped.count;
				if(poped.height==now) {
					people.count+=poped.count;
				}
			}
			
			
			if(!st.empty()) {
				sum++;
			}
			st.add(people);
		}
		System.out.println(sum);
	}
}