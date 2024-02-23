import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		
		StringBuilder result = new StringBuilder();
		for(int i=0; i<t; i++) {
			int n=sc.nextInt(), m=sc.nextInt();
			StringBuilder writeNum = new StringBuilder();
			for(int j=n; j<=m; j++) {
				writeNum.append(j);
			}
			String numbers = writeNum.toString();
			int lengthA = numbers.length();
			numbers=numbers.replaceAll("0", "");
			int lengthB = numbers.length();
			result.append(lengthA-lengthB+"\n");
		}
		System.out.println(result.toString());
	}
}