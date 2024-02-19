public class Main {

	public static void main(String[] args) {
		boolean[] judge = new boolean[10001];
		StringBuilder result = new StringBuilder();

		for (int i = 1; i <= 10000; i++) {
			if (!judge[i]) {
				result.append(i + "\n");
				int n = i;
				isSelf(n, judge);
			} else {
				continue;
			}
		}
		
		System.out.println(result.toString());
	}

	public static void isSelf(int n, boolean[] judge) {
		if (n <= 10000) {
			int sum = n;
			while (n != 0) {
				sum += n % 10;
				n /= 10;
			}
			
			if (sum <= 10000) {
				judge[sum] = true;
				isSelf(sum, judge);
			}
		}
	}
}