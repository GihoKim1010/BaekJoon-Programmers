import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		boolean[] cups = new boolean[3];
		cups[0]=true;
		
		for(int i=0; i<input.length(); i++) {
			if(input.charAt(i)=='A') {
				boolean temp = cups[0];
				cups[0]=cups[1];
				cups[1]=temp;
			}else if (input.charAt(i)=='B') {
				boolean temp = cups[1];
				cups[1]=cups[2];
				cups[2]=temp;
			}else {
				boolean temp = cups[2];
				cups[2]=cups[0];
				cups[0]=temp;
			}
		}
		for(int i=0; i<3; i++) {
			if(cups[i]==true) {
				System.out.println(i+1);
			}
		}
	}
}