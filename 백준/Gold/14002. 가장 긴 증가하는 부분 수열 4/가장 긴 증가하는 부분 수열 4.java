import java.util.Scanner;

public class Main {

    public static class Part{
        int count;
        StringBuilder result;

        public Part(int count, StringBuilder result){
            this.count=count;
            this.result=result;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N+1];
        Part[] dp = new Part[N+1];

        for(int i=0; i<=N; i++){
            dp[i]=new Part(0,new StringBuilder());
        }

        for (int i = 1; i <= N; i++) {
            arr[i] = sc.nextInt();
        }

        int index=0;

        for(int i=1;i<=N;i++){
            for(int j=i-1;j>=0;j--){
                if(arr[i]>arr[j]){
                    if(dp[i].count<dp[j].count+1){
                        dp[i].count=dp[j].count+1;
                        dp[i].result= new StringBuilder(dp[j].result.toString());
                        dp[i].result.append(arr[i]).append(" ");
                    }

                    if (dp[index].count < dp[i].count) {
                        index=i;
                    }
                }
            }
        }
        System.out.println(dp[index].count);
        System.out.println(dp[index].result.toString());
    }
}