import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt(), b = sc.nextInt(), count=1;
		
		while(b!=a) {
			count++;
			
			if(b%2==0) {
				b/=2;
			}else if(b%10==1){
				b/=10;
			}else {
				count=-1;
				break;
			}
			
			if(b<a) {
				count=-1;
				break;
			}
		}
		
		System.out.println(count);
	}
}