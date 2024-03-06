import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
	public static int isPelindrom(int[] nums, int left, int right) {
		while(left<=right) {
			if(nums[left]!=nums[right]) {
				return 0;
			}
			
			left++;
			right--;
		}
		
		return 1;
	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		int[] nums = new int[n];
		String numsInput = br.readLine();
		String[] tempInput = numsInput.split(" ");

		for (int i = 0; i < n; i++) {
			nums[i] = Integer.parseInt(tempInput[i]);
		}

		int m = Integer.parseInt(br.readLine());
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < m; i++) {
			String input = br.readLine();
			String[] temp = input.split(" ");
			int left = Integer.parseInt(temp[0])-1;
			int right = Integer.parseInt(temp[1])-1;
			result.append(isPelindrom(nums,left,right)+"\n");
		}
		
		bw.write(result.toString());
		bw.newLine();
		bw.flush();
		br.close();
		bw.close();
	}
}