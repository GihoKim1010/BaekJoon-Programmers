import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[] x = new String[2];
		x[0] = sc.nextLine();
		x[1] = sc.nextLine();
		String y = sc.nextLine();

		for (int i = 0; i < 2; i++) {
			if (x[i].equals("black")) {
				x[i] = "0";
			} else if (x[i].equals("brown")) {
				x[i] = "1";
			} else if (x[i].equals("red")) {
				x[i] = "2";
			} else if (x[i].equals("orange")) {
				x[i] = "3";
			} else if (x[i].equals("yellow")) {
				x[i] = "4";
			} else if (x[i].equals("green")) {
				x[i] = "5";
			} else if (x[i].equals("blue")) {
				x[i] = "6";
			} else if (x[i].equals("violet")) {
				x[i] = "7";
			} else if (x[i].equals("grey")) {
				x[i] = "8";
			} else if (x[i].equals("white")) {
				x[i] = "9";
			}

			if (y.equals("black")) {
				y = "";
			} else if (y.equals("brown")) {
				y = "0";
			} else if (y.equals("red")) {
				y = "00";
			} else if (y.equals("orange")) {
				y = "000";
			} else if (y.equals("yellow")) {
				y = "0000";
			} else if (y.equals("green")) {
				y = "00000";
			} else if (y.equals("blue")) {
				y = "000000";
			} else if (y.equals("violet")) {
				y = "0000000";
			} else if (y.equals("grey")) {
				y = "00000000";
			} else if (y.equals("white")) {
				y = "000000000";
			}
		}
		
		long result=Long.parseLong(x[0]+x[1]+y);
		System.out.println(result);
	}
}