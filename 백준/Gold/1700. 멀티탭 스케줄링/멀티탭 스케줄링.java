import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(), k = sc.nextInt();
		// 멀티탭에 꽂힌 기구를 저장할 arrayList와, 빼는 횟수를 저장할 count.
		ArrayList<Integer> ar = new ArrayList<>();
		int count = 0;

		// 전기용품 저장
		int[] codes = new int[k];
		for (int i = 0; i < k; i++) {
			codes[i] = sc.nextInt();
		}

		for (int i = 0; i < k; i++) {
			if (ar.contains(codes[i])) {
				continue;
			} else {
				ar.add(codes[i]);
			}

			if (ar.size() > n) {
				int maxDiff=-1, removeCode=0;
				loop_a:
				for (int j = 0; j < ar.size() - 1; j++) {
					int value = ar.get(j);
					for (int l = i + 1; l < codes.length; l++) {
						if(codes[l]==value) {
							int diff=l-i;
							if(diff>=maxDiff) {
								maxDiff=diff;
								removeCode=j;
							}
							break;
						}
						if(l==codes.length-1) {
							removeCode=j;
							break loop_a;
						}
					}
				}
				ar.remove(removeCode);
				count++;
			}
		}
		System.out.println(count);
	}
}