import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		String input = sc.nextLine();
		int no = 1;
		while(!input.contains("-")){
			Stack<String> st = new Stack<>();
			for(int i=0; i<input.length(); i++) {
				st.add(String.valueOf(input.charAt(i)));
			}
			int judge =0;
			int count =0;
			while(!st.isEmpty()) {
				String x = st.pop();
				if(x.equals("{")) {
					judge--;
				}else {
					judge++;
				}
				
				if(judge<0) {
					count++;
					judge+=2;
				}
			}
			
			count+=(Math.abs(judge))/2;
			sb.append(no+". ").append(count).append("\n");
			no++;
			input=sc.nextLine();
		}
		System.out.println(sb.toString());
	}
}