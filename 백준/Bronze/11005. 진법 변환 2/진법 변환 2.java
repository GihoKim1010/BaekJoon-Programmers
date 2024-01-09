import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] input = br.readLine().split(" ");
		int N =Integer.parseInt(input[0]);
		int B =Integer.parseInt(input[1]);
		StringBuilder answer = new StringBuilder();
		
		while(N>0) {
			int temp=N%B;
			N /=B;
			
			if(temp<10) {
				answer.insert(0, String.valueOf(temp));
			}else {
				int tempB=temp-10;
				char tempC=(char) (tempB+'A');
				answer.insert(0, String.valueOf(tempC));
			}
		}
		
		bw.write(answer.toString());
		bw.newLine();
		bw.flush();

		br.close();
		bw.close();
	}
}