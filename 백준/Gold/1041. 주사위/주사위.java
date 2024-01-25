import java.util.Scanner;

public class Main {
	
	public static int maxsingle(int A, int B, int C, int D, int E, int F) {
		int answer = A;
		answer = Math.max(answer, B);
		answer = Math.max(answer, C);
		answer = Math.max(answer, D);
		answer = Math.max(answer, E);
		answer = Math.max(answer, F);
		return answer;
	}

	public static int minsingle(int A, int B, int C, int D, int E, int F) {
		int answer = A;
		answer = Math.min(answer, B);
		answer = Math.min(answer, C);
		answer = Math.min(answer, D);
		answer = Math.min(answer, E);
		answer = Math.min(answer, F);
		return answer;
	}

	public static int mindouble(int A, int B, int C, int D, int E, int F) {
		int answer = A + B;
		answer = Math.min(answer, A + C);
		answer = Math.min(answer, A + D);
		answer = Math.min(answer, A + E);
		answer = Math.min(answer, B + C);
		answer = Math.min(answer, B + D);
		answer = Math.min(answer, B + F);
		answer = Math.min(answer, C + E);
		answer = Math.min(answer, C + F);
		answer = Math.min(answer, D + E);
		answer = Math.min(answer, D + F);
		answer = Math.min(answer, E + F);
		return answer;
	}

	public static int mintriple(int A, int B, int C, int D, int E, int F) {
		int answer = A + B + C;
		answer = Math.min(answer, A + C + E);
		answer = Math.min(answer, A + D + E);
		answer = Math.min(answer, A + B + D);
		answer = Math.min(answer, F + B + C);
		answer = Math.min(answer, F + C + E);
		answer = Math.min(answer, F + D + E);
		answer = Math.min(answer, F + B + D);
		return answer;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		long result=0;
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		int E = sc.nextInt();
		int F = sc.nextInt();

		if (N == 1) {
			result=(long)A+B+C+D+E+F-maxsingle(A,B,C,D,E,F);
		}else if(N==2) {
			result=(long)4*mindouble(A,B,C,D,E,F)+4*mintriple(A,B,C,D,E,F);
		}else {
			result=(long)(N-2)*(5*N-6)*minsingle(A,B,C,D,E,F)+(8*N-12)*mindouble(A,B,C,D,E,F)+4*mintriple(A,B,C,D,E,F);
		}
			

		System.out.println(result);
	}
}