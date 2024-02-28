import java.util.Scanner;

public class Main {

	public static int count;
	public static String input;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		input = sc.nextLine();
		count = 0;
		int result =changeNum();
		System.out.println(count);
		
		if(result%3==0) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}

	public static int changeNum() {
		if (input.length() == 1) {
			int result = Integer.parseInt(input);
			return result;
		} else {
			int sum = 0;
			count++;
			for (int i = 0; i < input.length(); i++) {
				sum += (int) (input.charAt(i) - '0');
			}
			input = String.valueOf(sum);
			return changeNum();
		}
	}
}