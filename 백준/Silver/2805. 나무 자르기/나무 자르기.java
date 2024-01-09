import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] nm = br.readLine().split(" ");
		int N = Integer.parseInt(nm[0]);
		int M = Integer.parseInt(nm[1]);
		int[] tree = new int[N];

		String[] temp = br.readLine().split(" ");
		for (int i = 0; i < N; i++) {
			tree[i] = Integer.parseInt(temp[i]);
		}

		Arrays.sort(tree);
		int min = 0;
		int max = tree[N - 1];

		
		int result = 0;

		while (min<=max) {
			// 나무 합산
			int mid = (max + min) / 2;
			long sum = 0;
			long sum_up = 0;
			
			for (int i = N - 1; i >= 0; i--) {
				if (tree[i] > mid) {
					sum += tree[i] - mid;
				} else {
					break;
				}
			}

			// 자르려는 나무 높이에서 한칸 위를 잘랐을 경우
			for (int i = N - 1; i >= 0; i--) {
				if (tree[i] > (mid + 1)) {
					sum_up += tree[i] - (mid + 1);
				} else {
					break;
				}
			}
			if (M > sum_up && M <= sum) {
				result=mid;
				break;
			} else if (sum > M) {
				min = mid + 1;
			} else if (sum < M) {
				max = mid - 1;
			}

		}

		bw.write(String.valueOf(result));
		bw.newLine();
		bw.flush();

		br.close();
		bw.close();
	}
}