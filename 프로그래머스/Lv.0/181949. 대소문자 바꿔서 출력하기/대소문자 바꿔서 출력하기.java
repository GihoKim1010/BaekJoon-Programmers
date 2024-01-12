import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder result = new StringBuilder();
		
		String str = br.readLine();
		
		for(int i =0; i<str.length(); i++) {
			char temp = str.charAt(i);
			
			if (Character.isUpperCase(temp)) {
				result.append(Character.toLowerCase(temp));
			}else if (Character.isLowerCase(temp)) {
				result.append(Character.toUpperCase(temp));
			}
		}
		
		bw.write(result.toString());
		bw.newLine();
		bw.flush();
		br.close();
		bw.close();
	}
}