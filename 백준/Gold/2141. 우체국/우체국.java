import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		ArrayList<long[]> ar = new ArrayList<>();
		
		int n = Integer.parseInt(br.readLine());
		long sum =0;
		
		for(int i=0; i<n; i++) {
			String[] input = br.readLine().split(" ");
			long x = Long.parseLong(input[0]);
			long a = Long.parseLong(input[1]);
			sum+=a;
			long[] temp = {x,a};
			ar.add(temp);
		}
		
		Collections.sort(ar, Comparator.comparing(arr->arr[0]));
		
		long mid = (sum%2==1)? sum/2 + 1 : sum/2;
		long countPeople = 0;
		long place=0;
		
		for(int i=0; i<n; i++) {
			countPeople+=ar.get(i)[1];
			if(countPeople>=mid) {
				place=ar.get(i)[0];
				break;
			}
		}
		
		bw.write(String.valueOf(place));
		bw.newLine();
		bw.flush();
		br.close();
		bw.close();
	}
}