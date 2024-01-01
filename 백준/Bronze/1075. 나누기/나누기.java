import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int F = sc.nextInt();
		int lastTwo=N%100;	//뒷 두자리
		int temp=N%F;
		int result=0;
		
		if(lastTwo>=temp) {
			result=lastTwo-temp;
		}else {
			result=lastTwo-temp+F;
		}
		
		while(result-F>=0) {
			result=result-F;
		}
		
		
		if(result<10) {
			System.out.println("0"+result);
		}else {
			System.out.println(result);
		}
	}
}