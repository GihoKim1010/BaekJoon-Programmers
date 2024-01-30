import java.util.Scanner;

public class Main {

	static StringBuilder result;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		result=new StringBuilder();
		System.out.println(move(1,2,3,N,0));
		System.out.println(result);
	}
	
	public static int move(int from, int sub, int to, int N, int count) {
		
		count++;
		if(N==1) {
			Main.result.append(from + " "+to + "\n");
			return count;
		}else {
			count = move(from, to, sub, N-1, count);
			Main.result.append(from + " " + to + "\n");
			count = move(sub, from, to, N-1, count);
		}
		return count;
	}
}