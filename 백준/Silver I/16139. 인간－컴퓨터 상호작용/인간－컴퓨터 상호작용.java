import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = br.readLine();
		int q=Integer.parseInt(br.readLine());
		int[][] ar = new int[s.length()+1][26];
		
		for(int i=0; i<s.length(); i++) {
			for(int j=0; j<26; j++) {
				ar[i+1][j]=ar[i][j];
			}
			ar[i+1][s.charAt(i)-'a']++;
		}
		StringBuilder result = new StringBuilder();
		for(int i=0; i<q; i++) {
			String input = br.readLine();
			String[] temp = input.split(" ");
			String a = temp[0];
			int x = a.charAt(0)-'a';
			int l = Integer.parseInt(temp[1]), r=Integer.parseInt(temp[2]);
			result.append(ar[r+1][x]-ar[l][x]+"\n");
		}
		
		bw.write(result.toString());
		bw.newLine();
		bw.flush();
		br.close();
		bw.close();
	}
}