import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] dp = new int[k + 1];
        Arrays.fill(dp, 100001);

        for (int i = 0; i < n; i++) {
            int coin = sc.nextInt();
            if(coin<=k){
                dp[coin]=1;
                for(int j=coin; j<=k; j++){
                    dp[j]=Math.min(dp[j],dp[j-coin]+1);
                }
            }
        }
        if(dp[k]==100001){
            dp[k]=-1;
        }
        System.out.println(dp[k]);
    }
}