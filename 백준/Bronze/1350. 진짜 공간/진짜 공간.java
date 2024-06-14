import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		Stack<Integer> save = new Stack<>();
		
		long count=0;
		
		for(int i=0; i<N; i++) {
			int file = sc.nextInt();
			save.add(file);
		}
		
		long cluster = sc.nextInt();
		
		for(int i=0; i<N; i++) {
			int file = save.pop();
			count+=(file%cluster==0) ? file/cluster : file/cluster+1;
		}
		
		System.out.println((long)count*cluster);
	}
}