import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int e = sc.nextInt(), s=sc.nextInt(), m=sc.nextInt();
		boolean judge = false;
		while(!judge) {
			if(e==s && s==m) {
				judge=true;
			}
			
			if(!judge) {
				if(e<=s && e<=m) {
					e+=15;
				}else if (s<=e && s<=m) {
					s+=28;
				}else if (m<=e && m<=s) {
					m+=19;
				}
			}
		}
		System.out.println(e);
	}
}