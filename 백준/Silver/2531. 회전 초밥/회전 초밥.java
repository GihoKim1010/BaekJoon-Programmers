import java.util.Scanner;

public class Main {
	
	static int[] belt, visit;
	static int N,d,k,c,max,count;
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		N=sc.nextInt(); d=sc.nextInt(); k=sc.nextInt(); c=sc.nextInt();
		belt=new int[N];
		visit=new int[d+1];
		max=0;
		count=0;
		for(int i=0; i<N; i++) {
			belt[i]=sc.nextInt();
			if(i<k) {
				visit[belt[i]]++;
				if(visit[belt[i]]==1) {
					count++;
				}
			}
		}
		slide();
		System.out.println(max);
	}
	
	static void slide() {
		for(int i=0; i<N; i++) {
			int left = belt[(i+N)%N];
			int right = belt[(i+k+N)%N];
			
			visit[left]--;
			if(visit[left]==0) {
				count--;
			}
			visit[right]++;
			if(visit[right]==1) {
				count++;
			}
			if(visit[c]==0) {
				max=Math.max(max, count+1);
			}else {
				max=Math.max(max, count);
			}
		}
	}
}