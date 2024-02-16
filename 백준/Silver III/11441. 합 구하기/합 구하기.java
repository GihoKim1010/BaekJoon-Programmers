import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] a = new int[n+1];
		
		for(int i=1; i<=n; i++) {
			a[i]=a[i-1]+sc.nextInt();
		}
		int m =sc.nextInt();
		StringBuilder result = new StringBuilder();
		for(int k=0; k<m; k++) {
			int i=sc.nextInt(), j=sc.nextInt();
			result.append(a[j]-a[i-1]+"\n");
		}
		
		System.out.println(result.toString());
	}
}