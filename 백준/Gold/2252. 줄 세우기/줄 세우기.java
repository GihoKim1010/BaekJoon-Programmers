import java.util.*;

public class Main {

    static int[] order;
    static ArrayList<ArrayList<Integer>> comp;
    static int n, m;
    static Queue<Integer> qu;
    static StringBuilder result;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); m=sc.nextInt();
        order = new int[n+1];
        comp = new ArrayList<>();
        qu = new LinkedList<>();
        result = new StringBuilder();

        for(int i=0; i<=n; i++) {
            comp.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            order[b]++;
            comp.get(a).add(b);
        }
        check();
        System.out.println(result.toString());
    }

    static void check(){
        for(int i=1;i<=n;i++){
            if(order[i]==0){
                qu.add(i);
                order[i]=-1;
                result.append(i+" ");
            }
        }

        int size = qu.size();

        for(int i=0; i<size; i++){
            int a = qu.poll();

            for(int comp : comp.get(a)){
                order[comp]--;
            }
        }

        if(size!=0){
            check();
        }
    }
}