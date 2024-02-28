import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String finding = sc.nextLine();
		int n = sc.nextInt();
		sc.nextLine();
		int count=0;
		
		for(int i=0; i<n; i++) {
			String input = sc.nextLine();
			StringBuilder rings = new StringBuilder(input);
			rings.append(input.substring(0, finding.length()));
			String newRing = rings.toString();
			while(true) {
				if(newRing.contains(finding)) {
					count++;
					newRing=newRing.replace(finding, "a");
				}else {
					break;
				}
			}
		}
		System.out.println(count);
	}
}