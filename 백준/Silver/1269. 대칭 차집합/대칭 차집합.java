import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] firstLine = br.readLine().split(" ");
		String[] secondLine = br.readLine().split(" ");
		String[] thirdLine = br.readLine().split(" ");
		int numA = Integer.parseInt(firstLine[0]);
		int numB = Integer.parseInt(firstLine[1]);
		
		HashSet<Integer> A = new HashSet<>();
		HashSet<Integer> temp = new HashSet<>();
		for(int i=0; i<numA; i++) {
			int tempA=Integer.parseInt(secondLine[i]);
			A.add(tempA);
			temp.add(tempA);
		}
		
		HashSet<Integer> B = new HashSet<>();
		for(int i=0; i<numB; i++) {
			int tempB=Integer.parseInt(thirdLine[i]);
			B.add(tempB);
		}
		
		A.removeAll(B);
		B.removeAll(temp);
		
		bw.write(String.valueOf(A.size()+B.size()));
		bw.newLine();
		bw.flush();

		br.close();
		bw.close();
	}
}