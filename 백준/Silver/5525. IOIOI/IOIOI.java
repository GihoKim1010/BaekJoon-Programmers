import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		String S = br.readLine();

		String target="I";
		for(int i=0; i<N; i++) {
			target +="OI";
		}

		int count = 0;
		int index = S.indexOf(target);
		
		while(index !=-1) {
			count++;
			index = S.indexOf(target, index+1);
		}
		
		bw.write(String.valueOf(count));
		bw.newLine();
		bw.flush();

		br.close();
		bw.close();
	}
}