import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt();
		int min = sc.nextInt();
		int sec = sc.nextInt();
		
		sec =hour*3600+min*60+sec;
		
		int time = sc.nextInt();
		
		sec+=time;
		
		min = sec/60;
		sec = sec%60;
		
		hour = min/60;
		min = min%60;
		
		hour = hour%24;
		
		System.out.println(hour+" "+min+" "+sec);
	}
}