import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
	static int count;
	
	public static int rec(int i, String S) {
		if(S.length()/2<=i) {
			return 1;
		}else if(S.charAt(i)!=S.charAt(S.length()-1-i)){
			return 0;
		}else {
			count++;
			return rec(i+1, S);
		}
	}
	
	public static int isPal(String S) {
		return rec(0, S);
	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		StringBuilder result = new StringBuilder();
		for(int i =0; i<N; i++) {
			String input = br.readLine();
			count=1;
			result.append(isPal(input)).append(" ").append(count).append("\n");
		}
		
		bw.write(result.toString());
		bw.newLine();
		bw.flush();
		br.close();
		bw.close();
	}
}