import java.io.*;
import java.util.Arrays;

public class Main {

    static int[][][] calc;
    static int[] step;

    public static void main(String[] args)  throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] dance = br.readLine().split(" ");
        step = Arrays.stream(dance).mapToInt(Integer::parseInt).toArray();
        calc = new int[5][5][step.length];
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                Arrays.fill(calc[i][j], -1);
            }
        }
        System.out.println(solve(0,0,0));
    }

    static int solve(int left, int right, int count){

       if(count == step.length-1){
           return 0;
       }

       if(calc[left][right][count] != -1){
           return calc[left][right][count];
       }

       calc[left][right][count] = Math.min(solve(step[count], right, count+1)+energy(left,step[count]), solve(left, step[count], count+1)+energy(right,step[count]));

       return calc[left][right][count];
    }

    static int energy(int from, int to){
        if(from == 0){
            return 2;
        }

        int diff = Math.abs(to-from);
        switch(diff){
            case 1:
            case 3:
                return 3;
            case 2:
                return 4;
            default:
                return 1;
        }
    }
}