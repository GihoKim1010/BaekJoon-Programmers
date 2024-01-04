import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;

public class Main {

	static class Person {
		int weight;
		int height;

		public Person(int weight, int height) {
			this.weight = weight;
			this.height = height;
		}
	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		HashMap<Integer, Person> people = new HashMap<>();

		for (int i = 0; i < N; i++) {
			String[] temp = br.readLine().split(" ");
			int weight = Integer.parseInt(temp[0]);
			int height = Integer.parseInt(temp[1]);
			people.put(i, new Person(weight, height));
		}

		for (int i = 0; i < N; i++) {
			int result = 1;
			for (int j = 0; j < N; j++) {
				if (i != j) {
					if (people.get(i).weight < people.get(j).weight && 
							people.get(i).height < people.get(j).height) {
						result++;
					}
				}
			}
			bw.write(result+ " ");
		}

		bw.newLine();
		bw.flush();

		br.close();
		bw.close();
	}
}