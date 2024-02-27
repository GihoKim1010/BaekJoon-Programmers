import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int time = sc.nextInt();

		int calcA = time / 300;
		time -= (calcA * 300);
		
		int calcB = time / 60;
		time -= (calcB * 60);
		
		int calcC = time / 10;
		time -= (calcC * 10);

		if(time!=0) {
			System.out.println(-1);
		}else {
			System.out.println(calcA+" "+calcB+" "+calcC);
		}
	}
}