import java.util.Scanner;

public class Main {

	public static boolean[] sieve(int max) {
		boolean[] judge = new boolean[max + 1];
		judge[0] = true;
		judge[1] = true;

		for (int i = 2; i * i <= max; i++) {
			if (!judge[i]) {
				for (int j = 2; j * i <= max; j++) {
					judge[i * j] = true;
				}
			}
		}
		return judge;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		StringBuilder answer = new StringBuilder();
		int T = sc.nextInt();
		int[] test = new int[T];
		int max = 0;
		for (int i = 0; i < T; i++) {
			test[i] = sc.nextInt();
			max=Math.max(max, test[i]);
		}
		boolean[] judge=sieve(max);

		for (int i = 0; i < T; i++) {
			for(int j=test[i]/2; j>=2; j--) {
				if(!judge[j] && !judge[test[i]-j]) {
					int x = test[i]-j;
					answer.append(j+" "+x).append("\n");
					break;
				}
			}
		}
		
		System.out.println(answer.toString());
	}
}