import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int min = 100;
		
		for(int i=0; i<7; i++) {
			int temp = sc.nextInt();
			if(temp%2==1) {
				sum+=temp;
				min=Math.min(min, temp);
			}
		}
		
		if(sum==0) {
			System.out.println(-1);
		}else {
			System.out.println(sum);
			System.out.println(min);
		}
	}
}
