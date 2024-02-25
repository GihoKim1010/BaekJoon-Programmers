import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int countChange =0;
		
		for(int i=1; i<s.length(); i++) {
			countChange = (s.charAt(i-1)!=s.charAt(i)) ? countChange+1 : countChange;
		}
		
		int answer = (countChange%2==1) ? countChange/2+1 : countChange/2;
		System.out.println(answer);
	}
}