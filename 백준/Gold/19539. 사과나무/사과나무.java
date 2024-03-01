import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int sum=0, countOdd=0, countTwo=0;
		boolean judge=true;
		
		for (int i = 0; i < n; i++) {
			int input = sc.nextInt();
			sum+=input;
			countTwo+=(input/2);
			if(input%2==1) {
				countOdd++;
			}
		}
		
		
		if(sum%3!=0) {
			judge=false;
		}else {
			int times = sum/3;
			if(times%2==1) {
				if(countOdd%2==0) {
					judge=false;
				}
			}
			
			if(times>countTwo) {
				judge=false;
			}
		}
		
		if(judge) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}
}