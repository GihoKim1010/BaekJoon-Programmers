import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String N = sc.next();

		int sum =0;
		HashMap<Integer, Integer> count = new HashMap<>();
		for(int i =0; i<N.length(); i++) {
			int num = (int)(N.charAt(i)-'0');
			sum+=num;
			count.put(num, count.getOrDefault(num, 0)+1);
		}
		
		if(sum%3==0 && count.containsKey(0)) {
			StringBuilder sb = new StringBuilder();
			for(int i=9; i>=0; i--) {
				if(count.containsKey(i)) {
					for(int j=0; j<count.get(i); j++) {
						sb.append(i);
					}
				}
			}
			System.out.println(sb.toString());
		}else {
			System.out.println(-1);
		}
		
	}
}