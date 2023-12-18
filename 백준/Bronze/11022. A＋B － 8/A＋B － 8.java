import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
		public static void main(String[] args) throws IOException {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

			int T = Integer.parseInt(br.readLine());
			int[] result = new int[T];
			int[] a=new int[T];
			int[] b=new int[T];

			for (int i = 0; i < T; i++) {
				String x = br.readLine();
				String[] y = x.split(" ");
				int[] z = new int[y.length];

				for (int j = 0; j < y.length; j++) {
					z[j] = Integer.parseInt(y[j]);
				}
				int sum = 0;
				for (int num : z) {
					sum += num;
				}
				result[i] = sum;
				a[i]=z[0];
				b[i]=z[1];
			}
			for (int i = 0; i < T; i++) {
				bw.write("Case #"+(i+1)+": "+a[i] +" + "+ b[i]+" = "+result[i] + "\n");
			}
			br.close();
			bw.close();
		}
	}