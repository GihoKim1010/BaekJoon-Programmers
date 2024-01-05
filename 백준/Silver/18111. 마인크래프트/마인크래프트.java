import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] firstLine = br.readLine().split(" ");
		int N = Integer.parseInt(firstLine[0]);
		int M = Integer.parseInt(firstLine[1]);
		int B = Integer.parseInt(firstLine[2]); // 원래 가진 블록 수

		int min_height = 255;
		int max_height = 0;

		HashMap<Integer, Integer> ground = new HashMap<>();

		for (int i = 0; i < N; i++) {
			String[] input = br.readLine().split(" ");
			for (int j = 0; j < M; j++) {
				int temp = Integer.parseInt(input[j]);
				// 땅의 높이를 key로, 그 높이의 땅 수를 value로 저장.
				ground.put(temp, ground.getOrDefault(temp, 0) + 1);

				min_height = Math.min(min_height, temp);
				max_height = Math.max(max_height, temp);
			}
		}

		int result_time = Integer.MAX_VALUE; // 결과 : 걸린 시간
		int result_height = 0; // 결과 : 땅의 높이

		for (int i = 0; i <= 256; i++) { // 만들 높이
			int time = 0;
			int need=0; //해당 높이까지 메꾸는데 필요한 블럭
			int more=B; //해당 높이까지 다 파면 남는 블럭
			
			for(int j=min_height; j<i; j++) {
				if(ground.get(j)!=null) {
					need +=((i-j)*ground.get(j));
				}
			}
			
			for(int j=max_height; j>i; j--) {
				if(ground.get(j)!=null) {
					more +=((j-i)*ground.get(j));
				}
			}

			if (more>=need) {
				for (int j = min_height; j <= max_height; j++) {
					if (ground.get(j) != null) {
						int tempA = ground.get(j);
						if (j < i) {
							time += (1 * tempA*(i-j));
						} else if (j > i) {
							time += (2 * tempA*(j-i));
						}
					}
				}
			}

			if (result_time >= time && more>=need) {
				result_time = time;
				result_height = i;
			}
		}

		bw.write(String.valueOf(result_time + " " + result_height));
		bw.newLine();

		bw.flush();

		br.close();
		bw.close();
	}
}