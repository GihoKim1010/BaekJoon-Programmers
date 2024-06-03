import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] count = new int[k+1];
        count[0]=1;

        for (int i = 0; i < n; i++) {
            int coin = sc.nextInt();

            for(int j=coin; j<=k; j++){
                count[j]+=count[j-coin];
            }
        }
        System.out.println(count[k]);
    }
}