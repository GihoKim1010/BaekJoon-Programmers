import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String input=br.readLine();
		String[] temp = input.split(" ");
		int N = Integer.parseInt(temp[0]);
		int K = Integer.parseInt(temp[1]);
		int a=1;
		int b=1;
		int c=1;
		
		for(int i=1; i<=N; i++) {
			a *=i;
		}
		for(int i=1; i<=K; i++) {
			b *=i;
		}
		for(int i=1; i<=N-K; i++) {
			c *=i;
		}
		

        bw.write(String.valueOf(a/b/c));
		bw.newLine();
		bw.flush();

		br.close();
		bw.close();
	}
}