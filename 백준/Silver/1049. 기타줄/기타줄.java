import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int min_whole = 1000;
		int min_single =1000;
		
		for(int i =0; i<M; i++) {
			int whole = sc.nextInt();
			int single = sc.nextInt();
			min_whole = Math.min(whole, min_whole);
			min_single = Math.min(single, min_single);
		}
		
		if(min_whole>=6*min_single) {
			System.out.println(min_single*N);
		}else if (N%6==0){
			System.out.println(min_whole*(N/6));
		}else {
			int temp = ((N/6)+1)*min_whole;
			int temp2 = (N/6)*min_whole+(N%6)*min_single;
			
			System.out.println(Math.min(temp, temp2));
		}
		
	}
}