import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		Stack<Integer> num = new Stack<>();

		for (int i = 0; i < N; i++) {
			int temp = Integer.parseInt(br.readLine());
			if (temp == 0) {
				num.pop();
			} else {
				num.add(temp);
			}
		}
		
		
		int result=0;
		while(num.size()>0) {
			int temp=num.pop();
			result +=temp;
		}

		bw.write(String.valueOf(result));
		bw.newLine();
		bw.flush();

		br.close();
		bw.close();
	}
}