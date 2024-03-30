import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String plates = sc.nextLine();
		
		int sum=10;
		
		for(int i=1; i<plates.length(); i++) {
			if(plates.charAt(i-1)!=plates.charAt(i)) {
				sum+=10;
			}else {
				sum+=5;
			}
		}
		System.out.println(sum);
	}
}