import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int price = sc.nextInt();
		int count = 0;
		int money = 1000 - price;
		
		int calc500 = money / 500;
		count+=calc500;
		money-=(calc500*500);
		
		int calc100 = money/100;
		count+=calc100;
		money-=(calc100*100);
		
		int calc50 = money / 50;
		count+=calc50;
		money-=(calc50*50);
		
		int calc10 = money/10;
		count+=calc10;
		money-=(calc10*10);
		
		int calc5 = money / 5;
		count+=calc5;
		money-=(calc5*5);
		
		int calc1 = money/1;
		count+=calc1;
		money-=(calc1*1);
		
		System.out.println(count);
	}
}