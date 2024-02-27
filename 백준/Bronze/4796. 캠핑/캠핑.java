import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=0;
		StringBuilder result = new StringBuilder();

		while (true) {
			int l = sc.nextInt(), p = sc.nextInt(), v = sc.nextInt();
			num++;
			if (l == 0 && p == 0 && v == 0) {
				break;
			} else {
				int able = (v/p)*l;
				int remain = v%p;
				able+=(remain>=l) ? l:remain;
				result.append("Case "+num+": "+able+"\n");
			}
		}
		System.out.println(result.toString());
	}
}