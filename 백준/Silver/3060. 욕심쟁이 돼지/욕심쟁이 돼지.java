import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		StringBuilder result = new StringBuilder();
		
		for(int i=0; i<T; i++) {
			int N = sc.nextInt();
			int sum=0;
			
			int[] pigs = new int[6];
			for(int j=0; j<6; j++) {
				pigs[j]=sc.nextInt();
				sum+=pigs[j];
			}
			
			int days =1;
			while(sum<=N) {
				int[] temp = new int[6];
				sum=0;
				for(int j=0; j<6; j++) {
					temp[j]=pigs[j]+pigs[(5+j)%6]+pigs[(j+1)%6]+pigs[(3+j)%6];
				}
				for(int j=0; j<6; j++) {
					pigs[j]=temp[j];
					sum+=pigs[j];
				}
				days++;
			}
			result.append(days).append("\n");
		}
		System.out.println(result.toString());
	}
}