import java.util.Scanner;

public class Main {
	
	public static long z(int r, int c, int N) {
		long size = (long) Math.pow(2, N);
		
		if(N==1) {
			if(r==0 && c==0) {
				return 0;
			}else if(r==1 && c==0) {
				return 2;
			}else if (r==0 && c==1) {
				return 1;
			}else {
				return 3;
			}
		}else {
			if(r<size/2 && c<size/2) {
				return z(r, c, N-1);
			}else if(r>= size/2 && c<size/2) {
				return z(r-(int)size/2, c, N-1)+2*(long)Math.pow(4, N-1);
			}else if(r<size/2 && c>=size/2) {
				return z(r, c-(int)size/2, N-1)+(long)Math.pow(4, N-1);
			}else {
				return z(r-(int)size/2, c-(int)size/2, N-1)+3*(long)Math.pow(4, N-1);
			}
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N= sc.nextInt();
		int r= sc.nextInt();
		int c= sc.nextInt();
		
		System.out.println(z(r,c,N));
	}
}