import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long[] x = new long[N+1];
        long[] y = new long[N+1];

        for(int i=0; i<N; i++) {
            String[] input = br.readLine().split(" ");
            x[i] = Long.parseLong(input[0]);
            y[i] = Long.parseLong(input[1]);
        }
        x[N] = x[0];
        y[N] = y[0];

        double sumA =0;
        double sumB =0;
        for(int i=0; i<N; i++) {
            sumA += x[i]*y[i+1];
            sumB += y[i]*x[i+1];
        }
        double sum = Math.abs(sumA-sumB);
        System.out.println(String.format("%.1f", sum/2));
    }
}