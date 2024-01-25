import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		StringBuilder result = new StringBuilder();

		for (int i = 0; i < T; i++) {
			long answer = 0;
			int x = sc.nextInt();
			int y = sc.nextInt();

			long distance = y - x;
			long z=(long) Math.sqrt(distance);
			
			
			if (distance == 1) {
				answer = 1;
			} else {
				while (true) {
					if(distance>z*(z-1) && distance<=z*z) {
						answer=2*z-1;
						break;
					}else if(distance>(z-1)*(z-1) && distance<=z*(z-1)) {
						answer=2*(z-1);
						break;
					}else {
						z++;
					}
				}
			}
			result.append(answer).append("\n");
		}

		System.out.println(result.toString());
	}
}