import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Main {
	
	static ArrayList<Integer>[] graph;
	static boolean[] visit;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] firstLine = br.readLine().split(" ");
		int N = Integer.parseInt(firstLine[0]);
		int M = Integer.parseInt(firstLine[1]);
		
		String[][] graph = new String[N+1][M+1];
		
		for(int i=1; i<=N; i++) {
			String input = br.readLine();
			for(int j=1; j<=M; j++) {
				char temp = input.charAt(j-1);
				graph[i][j]=String.valueOf(temp);
			}
		}
		int count=0;
		for(int i=1; i<=N; i++) {
			for(int j=1; j<=M;j++) {
				if(graph[i][j].equals(graph[i-1][j]) && graph[i][j].equals("|")) {
					count++;
				}else if(graph[i][j].equals(graph[i][j-1]) && graph[i][j].equals("-")) {
					count++;
				}
			}
		}
		bw.write(String.valueOf(N*M-count));
		bw.newLine();
		bw.flush();
		bw.close();
		br.close();
	}
}