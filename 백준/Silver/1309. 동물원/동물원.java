import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		long two = 0;
		long three = 1;
		
		for(int i =2; i<=n; i++) {
			long temp = two;
			two = (two + 2*three)%9901;
			three = (temp + three)%9901;
		}
		
		System.out.println(((2*two)%9901+(3*three)%9901)%9901);
	}
}