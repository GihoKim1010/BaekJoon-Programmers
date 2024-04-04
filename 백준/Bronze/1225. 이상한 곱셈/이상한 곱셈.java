import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		String[] nums = input.split(" ");
		long sum=0;
		
		for(int i=0; i<nums[0].length(); i++) {
			int a = (int) (nums[0].charAt(i)-'0');
			
			for(int j=0; j<nums[1].length(); j++) {
				int b = (int) (nums[1].charAt(j)-'0');
				
				sum+=a*b;
			}
		}
		
		System.out.println(sum);
	}
}