import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n=sc.nextInt();
		sc.nextLine();
		StringBuilder answer = new StringBuilder();
		
		for(int i=1; i<=n; i++) {
			String input = sc.nextLine();
			String[] ar = input.split(" ");
			
			answer.append("Case #"+i+": ");
			
			for(int j=ar.length-1; j>=0; j--) {
				answer.append(ar[j]+" ");
			}
			answer.append("\n");
		}
		System.out.println(answer.toString());
	}
}