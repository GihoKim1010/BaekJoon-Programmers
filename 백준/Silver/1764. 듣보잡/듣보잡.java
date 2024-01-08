import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] firstLine = br.readLine().split(" ");
		int N=Integer.parseInt(firstLine[0]);
		int M=Integer.parseInt(firstLine[1]);
		
		TreeSet<String> noHear = new TreeSet<>();
		TreeSet<String> noSee = new TreeSet<>();
		
		for(int i = 0; i<N; i++) {
			noHear.add(br.readLine());
		}
		
		for(int i = 0; i<M; i++) {
			noSee.add(br.readLine());
		}
		
		noHear.retainAll(noSee);
		
		bw.write(String.valueOf(noHear.size()));
		bw.newLine();
		
		for(String x:noHear) {
			bw.write(x);
			bw.newLine();
		}
		bw.flush();

		br.close();
		bw.close();
	}
}