import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static int findGCD(int a, int b) {
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String input = br.readLine();
		String[] temp = input.split(" ");
		int a=Integer.parseInt(temp[0]);
		int b=Integer.parseInt(temp[1]);
		
		int result1=findGCD(a,b);
		int result2=a*b/result1;
		

		bw.write(String.valueOf(result1));
		bw.newLine();
		bw.write(String.valueOf(result2));
		bw.newLine();
		bw.flush();

		br.close();
		bw.close();
	}
}