import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		int count=0;
		int temp = n;
		
		while(true) {
			int a=temp/10;
			int b=temp%10;
			temp=(a+b)%10 + (10*b);
			count++;
			
			if(temp==n) {
				break;
			}
		}
		
		
		bw.write(String.valueOf(String.valueOf(count)));
		bw.newLine();
		bw.flush();
		br.close();
		bw.close();
	}
}