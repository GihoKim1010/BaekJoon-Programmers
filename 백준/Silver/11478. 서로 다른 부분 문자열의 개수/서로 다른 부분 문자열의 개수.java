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

		String input = br.readLine();
		HashSet<String> result = new HashSet<>();
		
		for(int i =0; i<input.length(); i++) {
			for(int j=i+1; j<input.length()+1; j++) {
				String newString = input.substring(i,j);
				result.add(newString);
			}
		}
		
		bw.write(String.valueOf(result.size()));
		bw.newLine();
		bw.flush();

		br.close();
		bw.close();
	}
}