import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String input = sc.nextLine();
		String[] temp = input.split(" ");
		long min = Long.parseLong(temp[0]);
		long max = Long.parseLong(temp[1]);

		boolean[] judge = new boolean[(int) (max - min + 1)]; // 해당숫자-min index에 저장됨
		
		
		long x = (long)Math.sqrt(min);

		for(long i=2; i*i<=max; i++) {
			long sq = i*i;
			
			for(long j=min/sq + (min%sq !=0 ? 1:0); j*sq<=max; j++) {
				if(!judge[(int) (j*sq-min)]) {
					judge[(int) (j*sq-min)]=true;
				}
			}
		}
		
		
		long count = 0L;
		for(boolean y : judge) {
			if(!y) {
				count++;
			}
		}
		System.out.println(count);
	}
}