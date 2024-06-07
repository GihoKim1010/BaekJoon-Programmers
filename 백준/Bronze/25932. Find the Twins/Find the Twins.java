import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		StringBuilder result = new StringBuilder();
		for(int i=0; i<n; i++) {
			boolean zack=false;
			boolean mack=false;
			String input = sc.nextLine();
			String[] temp = input.split(" ");
			
			for(int j=0; j<10; j++) {
				if(temp[j].equals("17")) {
					zack=true;
				}else if(temp[j].equals("18")) {
					mack=true;
				}
			}
			
			result.append(input).append("\n");
			
			if(zack && mack) {
				result.append("both").append("\n");
			}else if(zack) {
				result.append("zack").append("\n");
			}else if(mack) {
				result.append("mack").append("\n");
			}else {
				result.append("none").append("\n");
			}
			result.append("\n");
		}
		System.out.println(result.toString());
	}
}