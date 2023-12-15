import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String a;
		a=sc.nextLine();
		
		String[] b = a.split(" ");
		
		long[] c = new long[b.length];
		
		for(int i=0; i<b.length; i++) {
			c[i]=Long.parseLong(b[i]);
		}
		
		System.out.println(c[0]+c[1]+c[2]);
	}
}