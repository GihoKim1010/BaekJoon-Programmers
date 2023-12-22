import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		ArrayList<String> result = new ArrayList<>();

		for (int i = 0; i < T; i++) {
			int money = sc.nextInt();
			int quarter = money / 25;
			int dime = (money % 25) / 10;
			int nickel = ((money % 25) % 10) / 5;
			int penny = ((money % 25) % 10) % 5;
			result.add(quarter+" "+dime+" "+nickel+" "+penny);
		}

		for(String x:result) {
			System.out.println(x);
		}
	}
}