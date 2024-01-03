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

		double n = Double.parseDouble(br.readLine());
		double[] score = new double[(int) n];

		for (int i = 0; i < n; i++) {
			score[i] = Double.parseDouble(br.readLine());
		}
		Arrays.sort(score);
		
		long temp=Math.round(n*0.15);
		int x=(int) temp;
		
		double sum=0;
		for(int i=x; i<=score.length-1-x; i++) {
			sum +=score[i];
		}
		
		double y=sum/(n-(2*x));
		int result=(int) Math.round(y);
		
		bw.write(String.valueOf(result));
		bw.newLine();
		bw.flush();
		
		br.close();
		bw.close();
	}
}
