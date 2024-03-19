import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;


public class Main {

	static class Number{
		int num;
		int index;
		
		Number(int num, int index) {
			this.num=num;
			this.index=index;
		}
	}
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n= Integer.parseInt(st.nextToken()), l=Integer.parseInt(st.nextToken());
		Deque<Number> dq = new LinkedList<>();
		StringBuilder answer = new StringBuilder();
		
		st = new StringTokenizer(br.readLine());
		for(int i=1; i<=n; i++) {
			int now = Integer.parseInt(st.nextToken());
			Number number = new Number(now, i);
			
			if(!dq.isEmpty() && dq.peekFirst().index<=i-l) {
				dq.pollFirst();
			}
			
			while(!dq.isEmpty() && dq.peekLast().num>now){
				dq.pollLast();
			}
			
			dq.add(number);
			
			answer.append(dq.peekFirst().num+" ");
		}
		bw.write(answer.toString());
		bw.flush();
		bw.newLine();
		br.close();
		bw.close();
	}
}