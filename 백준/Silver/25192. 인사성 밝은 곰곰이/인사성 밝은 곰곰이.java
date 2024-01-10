import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		HashSet<String> hs = new HashSet<>();
		int N = Integer.parseInt(br.readLine());
		int count=0;
		for(int i=0; i<N; i++) {
			String input = br.readLine();
			
			if(input.equals("ENTER")) {
				hs.clear();
			}else {
				int temp=hs.size();
				hs.add(input);
				if(hs.size()>temp) {
					count++;
				}
			}
		}
		
		bw.write(String.valueOf(count));
		bw.newLine();
		bw.flush();

		br.close();
		bw.close();
	}
}