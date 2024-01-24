import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(br.readLine());
		StringBuilder answer = new StringBuilder();
		
		for(int i =0; i<T; i++) {
			String[] input = br.readLine().split(" ");
			int a = Integer.parseInt(input[0]);
			int b = Integer.parseInt(input[1]);
			if(b%4==0) {
				b=4;
			}else {
				b=b%4;
			}
			a=(int)Math.pow(a, b);
			if(a%10==0) {
				answer.append(10).append("\n");
			}else {
				answer.append(a%10).append("\n");
			}
		}

		bw.write(answer.toString());
		bw.newLine();
		bw.flush();
		br.close();
		bw.close();
	}
}