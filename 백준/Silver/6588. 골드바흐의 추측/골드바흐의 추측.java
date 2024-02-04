import java.util.ArrayList;
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
		int max = 0;
		ArrayList<Integer> nums = new ArrayList<>();
		while(true) {
			int test = sc.nextInt();
			if(test==0) {
				break;
			}
			nums.add(test);
			max=Math.max(max, test);
		}
		int T = nums.size();
		boolean[] judge=sieve(max);

		for (int i = 0; i < T; i++) {
			for(int j=2; j<=nums.get(i)/2; j++) {
				if(!judge[j] && !judge[nums.get(i)-j]) {
					int x = nums.get(i)-j;
					answer.append(nums.get(i)+" = "+j+" + "+x).append("\n");
					break;
				}
			}
		}
		
		System.out.println(answer.toString());
	}
}