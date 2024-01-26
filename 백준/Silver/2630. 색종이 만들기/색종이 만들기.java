import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
	public static int white =0;
	public static int blue =0;
	public static int[][] paper;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		// 이차원 배열에 종이 상태 저장
		paper = new int[N][N];

		for (int i = 0; i < N; i++) {
			String input = br.readLine();
			String[] temp = input.split(" ");
			for (int j = 0; j < N; j++) {
				paper[i][j] = Integer.parseInt(temp[j]);
			}
		}
		
		cut(0,0,N);

		bw.write(String.valueOf(white));
		bw.newLine();
		bw.write(String.valueOf(blue));
		bw.newLine();
		bw.flush();
		br.close();
		bw.close();
		
	}
	
	public static int judge(int x, int y, int N) {
		
		int color = paper[x][y];
		
		for(int i=x; i<x+N; i++) {
			for(int j=y; j<y+N; j++) {
				if(paper[i][j]!=color) {
					return 2;
				}
			}
		}
		return color;
	}
	
	public static void cut(int x, int y, int N) {
		
		if(judge(x,y,N)==0) {
			white++;
		}else if(judge(x,y,N)==1) {
			blue++;
		}else {
			cut(x,y,N/2);
			cut(x+N/2,y,N/2);
			cut(x,y+N/2,N/2);
			cut(x+N/2,y+N/2,N/2);
		}
	}
}