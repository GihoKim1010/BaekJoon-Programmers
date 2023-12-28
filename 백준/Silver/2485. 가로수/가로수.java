import java.util.Scanner;

public class Main {

	// 유클리드 호제법 사용
	public static int findGCD(int a, int b) {
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}

	// 여러 숫자들간의 최대 공약수 구하기
	public static int findMultipleGCD(int[] numbers) {
		int gcd = numbers[0];

		for (int i = 1; i < numbers.length; i++) {
			gcd = findGCD(gcd, numbers[i]);
		}
		return gcd;
	}

	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] tree = new int[N];

		// 심어져있는 나무 좌표 저장
		for (int i = 0; i < N; i++) {
			tree[i] = sc.nextInt();
		}

		// 나무간 간격 저장
		int[] apart = new int[N - 1];
		for (int i = 0; i < N - 1; i++) {
			apart[i] = tree[i + 1] - tree[i];
		}

		// 최대공약수 x
		int x = findMultipleGCD(apart);
		
		//빈자리 계산
		int i=1;
		int z=x;
		int count=0;
		
		while(tree[i-1]+z<=tree[N-1]) {
			if(tree[i]==tree[i-1]+z) {
				i++;
				z=x;
			}else {
				count++;
				z+=x;
			}
		}
		System.out.println(count);
	}
}