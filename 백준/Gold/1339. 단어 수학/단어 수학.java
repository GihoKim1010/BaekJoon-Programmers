import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine();
        int[] sum = new int[26];

        for (int i = 0; i < N; i++) {
            char[] input = sc.nextLine().toCharArray();
            int multiply=1;
            for(int j=input.length-1;j>=0;j--){
                sum[input[j]-'A']+=multiply;
                multiply*=10;
            }
        }

        Arrays.sort(sum);

        long calc = 0;
        int num=9;
        for(int i=0; i<10; i++){
            calc+=sum[25-i]*num;
            num--;
        }
        System.out.println(calc);
    }
}