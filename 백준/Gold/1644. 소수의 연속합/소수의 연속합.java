import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		boolean[] sieve = new boolean[N + 1]; // false가 소수
		sieve[0] = true;
		sieve[1] = true;
		int count = 0;
		Queue<Integer> max_qu = new LinkedList<>(); // 소수 저장
		Queue<Integer> min_qu = new LinkedList<>(); // max에 사용했던 소수 저장.

		if (N == 1) {
			count = 0;
		} else if (N == 2) {
			count = 1;
		} else {
			for (int i = 2; i * i <= N; i++) {
				if (!sieve[i]) {
					for (int j = 2; j * i <= N; j++) {
						sieve[i * j] = true;
					}
				}
			}

			for (int i = 3; i <= N; i++) {
				if (!sieve[i]) {
					max_qu.add(i);
				}
			}
			min_qu.add(2);
		
		int sum = 2;
		
		while(!max_qu.isEmpty() || sum>=N){
			if(sum<N) {
				if(max_qu.isEmpty() && sum<N) {
					break;
				}
				int x=max_qu.poll();
				sum+=x;
				min_qu.add(x);
			}else {
				if(min_qu.isEmpty() && sum>N) {
					break;
				}
				int x = min_qu.poll();
				sum-=x;
			}
			
			if(sum==N) {
				count++;
			}
		}
	}
		
		System.out.println(count);
	}
}