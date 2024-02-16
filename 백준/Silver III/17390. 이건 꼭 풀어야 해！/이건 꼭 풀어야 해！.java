import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String nq = br.readLine();
		String[] spNq = nq.split(" "); 
		
		int n = Integer.parseInt(spNq[0]), q=Integer.parseInt(spNq[1]);
		int[] a = new int[n+1];
		String ar = br.readLine();
		String[] arr = ar.split(" ");
		
		for(int i =1; i<=n; i++) {
			a[i]=Integer.parseInt(arr[i-1]);
		}
		
		Arrays.sort(a);
		
		for(int i =1; i<=n; i++) {
			a[i]+=a[i-1];
		}
		
		StringBuilder result = new StringBuilder();
		for(int i =0; i<q; i++) {
			String questions = br.readLine();
			String[] lr = questions.split(" ");
			int l=Integer.parseInt(lr[0]), r=Integer.parseInt(lr[1]);
			result.append(a[r]-a[l-1]+"\n");
		}
		
		bw.write(result.toString());
		bw.newLine();
		bw.flush();
		br.close();
		bw.close();
	}
}