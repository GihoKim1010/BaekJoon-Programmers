import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt(), b=sc.nextInt(), c=sc.nextInt();
		int[] temp = {a,b,c};
		Arrays.sort(temp);
		System.out.println(temp[1]);
	}
}