import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		boolean[] visit = new boolean[2001];
		int N=sc.nextInt();
		ArrayList<Integer> result = new ArrayList<>();
		
		for(int i=0; i<N; i++) {
			int x = sc.nextInt();
			if(!visit[x+1000]) {
				visit[x+1000]=true;
				result.add(x);
			}
		}
		
		Collections.sort(result);
		StringBuilder answer = new StringBuilder();
		
		for(int i : result) {
			answer.append(i+" ");
		}
		
		System.out.println(answer.toString());
		
	}
}