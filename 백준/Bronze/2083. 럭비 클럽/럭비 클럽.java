import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StringBuilder result = new StringBuilder();
		
		while(true) {
			String member = sc.nextLine();
			if(member.equals("# 0 0")) {
				break;
			}else {
				String[] temp = member.split(" ");
				int age = Integer.parseInt(temp[1]);
				int weight = Integer.parseInt(temp[2]);
				
				if(age>17 || weight>=80) {
					result.append(temp[0]+" Senior").append("\n");
				}else {
					result.append(temp[0]+" Junior").append("\n");
				}
			}
		}
		System.out.println(result.toString());
	}
}