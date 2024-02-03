import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
	
	public static int sumNo(String x) {
		int sum=0;
		for(int i=0; i<x.length(); i++) {
			if(Character.isDigit(x.charAt(i))) {
				sum+=x.charAt(i)-'0';
			}
		}
		return sum;
	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.valueOf(br.readLine());
		String[] serialNo = new String[N];
		
		for(int i =0; i<N; i++) {
			serialNo[i] = br.readLine();
		}
		
		Arrays.sort(serialNo, new Comparator<String>() {
			@Override
			
			public int compare(String x, String y) {
				//시리얼 넘버 길이순
				if(x.length()!=y.length()) {
					return x.length()-y.length();
				}
				
				//내부 숫자의 합을 다 더해서 작은순
				if(sumNo(x)!=sumNo(y)) {
					return sumNo(x)-sumNo(y);
				}
				
				//사전순 (숫자가 앞으로)
				return x.compareTo(y);
				
			}
			
		});
		
		StringBuilder result = new StringBuilder();
		for(String x:serialNo) {
			result.append(x).append("\n");
		}
		
		bw.write(result.toString());
		bw.newLine();
		bw.flush();
		br.close();
		bw.close();
	}
}