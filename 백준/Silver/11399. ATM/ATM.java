import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		String[] people = br.readLine().split(" ");
		int[] time = new int[N];

		for (int i = 0; i < N; i++) {
			time[i] = Integer.parseInt(people[i]);
		}
		
		Arrays.sort(time);
		
		int resultTime = 0;
		for(int i=0; i<N; i++) {
			resultTime +=(N-i)*time[i];
		}
		
		
		bw.write(String.valueOf(resultTime));
		bw.newLine();
		bw.flush();

		br.close();
		bw.close();
	}
}