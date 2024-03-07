import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int t = Integer.parseInt(br.readLine());
		StringBuilder answer = new StringBuilder();

		for (int i = 0; i < t; i++) {
			int k = Integer.parseInt(br.readLine());
			// 최댓값을 뽑을 우선순위 큐
			PriorityQueue<Long> max = new PriorityQueue<>(Comparator.reverseOrder());
			// 최솟값을 뽑을 우선순위 큐
			PriorityQueue<Long> min = new PriorityQueue<>();
			// 큐가 하나라고 가정했을 때, 그 값을 정말 가지고 있는지 여부를 결정할 맵
			HashMap<Long, Integer> hm = new HashMap<>();
			// 큐가 하나라고 가정했을 때, 큐의 사이즈를 저장.
			int size = 0;

			for (int j = 0; j < k; j++) {
				String input = br.readLine();

				if (input.equals("D -1")) {
					if (size > 0) {
						while (true) {
							long temp = min.peek();
							if (hm.get(temp) > 0) {
								hm.put(temp, hm.get(temp) - 1);
								size--;
								min.poll();
								break;
							} else {
								min.poll();
							}
						}
					}
				} else if (input.equals("D 1")) {
					if (size > 0) {
						while (true) {
							long temp = max.peek();
							if (hm.get(temp) > 0) {
								hm.put(temp, hm.get(temp) - 1);
								size--;
								max.poll();
								break;
							}else {
								max.poll();
							}
						}
					}
				} else {
					String[] sp = input.split(" ");
					long x = Long.parseLong(sp[1]);
					max.add(x);
					min.add(x);
					size++;
					hm.put(x, hm.getOrDefault(x, 0) + 1);
				}
			}

			if (size == 0) {
				answer.append("EMPTY").append("\n");
			} else {
				long maxResult = 0, minResult=0;
				while(true) {
					maxResult=max.poll();
					if(hm.get(maxResult)>0) {
						break;
					}
				}
				while(true) {
					minResult=min.poll();
					if(hm.get(minResult)>0) {
						break;
					}
				}
				answer.append(maxResult + " " + minResult + "\n");
			}
		}

		bw.write(answer.toString());
		bw.newLine();
		bw.flush();
		br.close();
		bw.close();
	}
}