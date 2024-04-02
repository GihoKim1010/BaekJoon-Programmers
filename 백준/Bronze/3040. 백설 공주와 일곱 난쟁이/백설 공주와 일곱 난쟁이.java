import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] nums = new int[9];
		int sum=0;
		for (int i = 0; i < 9; i++) {
			nums[i]=sc.nextInt();
			sum+=nums[i];
		}
		
		int plus = sum-100;
		int a=0,b=0;
		for(int i=0; i<8; i++) {
			for(int j=i+1; j<9; j++) {
				if(nums[i]+nums[j]==plus) {
					a=i;
					b=j;
				}
			}
		}
		for(int i=0; i<9; i++) {
			if(i!=a && i!=b) {
				System.out.println(nums[i]);
			}
		}
	}
}
