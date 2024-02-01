import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		Stack<int[]> nums = new Stack<>();

		int N = Integer.valueOf(br.readLine());
		String input = br.readLine();
		String[] sp = input.split(" ");
		int[] answer = new int[N];

		for (int i = N-1; i >=0; i--) {
			int z = Integer.parseInt(sp[i]);
			int[] temp = { i, z };
			while (true) {
				if (!nums.isEmpty() && nums.peek()[1] < z) {
					answer[nums.peek()[0]] = i+1;
					nums.pop();
				}else {
					nums.add(temp);
					break;
				}
			}
		}
		StringBuilder result = new StringBuilder();
		
		for(int x:answer) {
			result.append(x+" ");
		}

		bw.write(result.toString());
		bw.newLine();
		bw.flush();
		br.close();
		bw.close();
	}
}