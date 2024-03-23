import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int A=sc.nextInt(), B=sc.nextInt();
		
		int[] ar = new int[B+1];
		
		int num =1;
		int count=0;
		
		for(int i=1; i<=B; i++) {
			ar[i]=ar[i-1]+num;
			count++;
			
			if(num==count) {
				num++;
				count=0;
			}
		}
		System.out.println(ar[B]-ar[A-1]);
	}
}