import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();
		StringBuilder result = new StringBuilder();
		
		for(int i=0; i<T; i++) {
			int input = sc.nextInt();
			String temp = String.valueOf(input);
			StringBuilder temp2 = new StringBuilder(temp).reverse();
			int output = Integer.parseInt(temp2.toString());
			int sum = input+output;
			String tempInput=String.valueOf(sum);
			StringBuilder temp3 = new StringBuilder(tempInput).reverse();
			String tempOutput=temp3.toString();
			if(tempInput.equals(tempOutput)) {
				result.append("YES").append("\n");
			}else {
				result.append("NO").append("\n");
			}
		}
		System.out.println(result.toString());
	}
}