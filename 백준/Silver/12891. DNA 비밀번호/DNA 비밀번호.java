import java.util.HashMap;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int S=sc.nextInt(), P=sc.nextInt();
		sc.nextLine();
		String input=sc.nextLine();
		int A=sc.nextInt(), C=sc.nextInt(), G=sc.nextInt(), T=sc.nextInt();
		
		String first = input.substring(0, P);
		HashMap<Character, Integer>count = new HashMap<>();
		count.put('A', 0);
		count.put('C', 0);
		count.put('G', 0);
		count.put('T', 0);
		int answer=0;
		for(int i=0; i<first.length(); i++) {
			char now = first.charAt(i);
			count.put(now, count.get(now)+1);
		}
		
		if(count.get('A')>=A && count.get('C')>=C && count.get('G')>=G && count.get('T')>=T) {
			answer++;
		}
		
		for(int i=1; i<S-P+1; i++) {
			char left = input.charAt(i-1);
			char right = input.charAt(i+P-1);
			
			count.put(left, count.get(left)-1);
			count.put(right, count.get(right)+1);
			
			if(count.get('A')>=A && count.get('C')>=C && count.get('G')>=G && count.get('T')>=T) {
				answer++;
			}
		}
		System.out.println(answer);
	}
}