import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		//2108번 문제. 통계학.
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt(); // 첫줄에 숫자 갯수 N 입력
		int[] result = new int[4]; // result[]에 산술평균, 중앙값, 최빈값, 범위 순으로 저장.

		// N개의 숫자 입력받아 배열 numList[]에 저장
		int[] numList = new int[N];

		for (int i = 0; i < N; i++) {
			numList[i] = sc.nextInt();
		}

		// 산술평균을 result[0]에 저장.
		long sum = 0;
		for (long x : numList) {
			sum += x;
		}
		result[0]=(int) Math.round((double)sum/N);	//반올림값. double로 계산 후 int로 변환
		

		

		// 중앙값을 result[1]에 저장.
		Arrays.sort(numList); // 배열 numList[]를 크기순으로 정렬
		result[1] = (int) numList[((N + 1) / 2) - 1];

		// 최빈값을 result[2]에 저장.
		int[] count = new int[8001]; // 절댓값 4000이내를 나타낼 배열 생성. (-4000~4000 까지 순서대로)
		for (int i = 0; i < numList.length; i++) {
			for (int j = -4000; j <= 4000; j++) {
				if (numList[i] == j) {
					count[j + 4000] = count[j + 4000] + 1;
				}
			}
		}

		int[] temp = new int[count.length]; // 최빈값이 몇번 나온 수인지 알아보기 위해 임시로 생성
		for (int i = 0; i < count.length; i++) {
			temp[i] = count[i];
		}

		Arrays.sort(temp); // 빈도를 크기순 정렬
		int mostCounted = temp[temp.length - 1]; // 최빈값의 빈도를 저장

		ArrayList<Integer> myNum = new ArrayList<Integer>(); // 최빈값을 저장하기 위한 ArrayList
		for (int i = 0; i < count.length; i++) {
			if (count[i] == mostCounted) {
				myNum.add(i - 4000);
			}
		}

		if (myNum.size() >= 2) {
			result[2] = myNum.get(1);
		} else {
			result[2] = myNum.get(0);
		}

		// 범위를 result[3]에 저장.
		result[3] = (int) (numList[numList.length - 1] - numList[0]);

		// 출력
		for (long x : result) {
			System.out.println(x);
		}
	}
}