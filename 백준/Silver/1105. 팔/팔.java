import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		long L = sc.nextLong();
		long R = sc.nextLong();
		
		while(L<=R && L!=0) {
			if(L%10==8) {
				if(L==R) {
					break;
				}else {
					L++;
				}
			}else {
				L/=10;
				R/=10;
			}
		}
		
		int count =0;
		while(L!=0) {
			if(L%10==8) {
				count++;
			}
			L/=10;
		}
		System.out.println(count);
	}
}