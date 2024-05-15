import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) {
			int space=0, up =0, down=0, num=0;
			String input = sc.nextLine();
			for(int i=0; i<input.length(); i++) {
				if(input.charAt(i)==' ') {
					space++;
				}else if (input.charAt(i)>=97 && input.charAt(i)<=122) {
					down++;
				}else if (input.charAt(i)>='0' && input.charAt(i)<='9'){
					num++;
				}else {
					up++;
				}
			}
			System.out.println(down+" "+up+" "+num+" "+space);
		}
	}
}