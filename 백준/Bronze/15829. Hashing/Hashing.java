import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int L = Integer.parseInt(br.readLine());
		String word = br.readLine();
		int[] change = new int[L];

		for(int i=0; i<L; i++) {
			int temp=(int) word.charAt(i)-'a'+1;
			change[i]=temp*(int)Math.pow(31, i);
		}
		
		int sum=0;
		for(int x:change) {
			sum +=x;
		}
		
		bw.write(String.valueOf(sum%1234567891));
		bw.newLine();
		bw.flush();

		br.close();
		bw.close();
	}
}