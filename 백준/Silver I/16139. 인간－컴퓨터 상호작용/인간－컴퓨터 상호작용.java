import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int q=sc.nextInt();
		int[][] ar = new int[s.length()+1][26];
		
		for(int i=0; i<s.length(); i++) {
			for(int j=0; j<26; j++) {
				ar[i+1][j]=ar[i][j];
			}
			ar[i+1][s.charAt(i)-'a']++;
		}
		StringBuilder result = new StringBuilder();
		for(int i=0; i<q; i++) {
			String a = sc.next();
			int x = a.charAt(0)-'a';
			int l = sc.nextInt(), r=sc.nextInt();
			result.append(ar[r+1][x]-ar[l][x]+"\n");
		}
		
		System.out.println(result.toString());
	}
}