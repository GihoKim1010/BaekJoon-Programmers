import java.io.*;
import java.lang.*;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder result = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++) {
            Set<Integer> note = new HashSet<>();

            int N = Integer.parseInt(br.readLine());
            String input1 = br.readLine();
            String[] sp1 = input1.split(" ");
            int M = Integer.parseInt(br.readLine());
            String input2 = br.readLine();
            String[] sp2 = input2.split(" ");

            for(int j = 0; j < N; j++) {
                note.add(Integer.parseInt(sp1[j]));
            }

            for(int j = 0; j < M; j++) {
                result.append(note.contains(Integer.parseInt(sp2[j])) ? '1' : '0').append("\n");
            }
        }
        bw.write(result.toString());
        bw.close();
    }
}