import java.io.*;

public class Main {
    static int n;
    static int[][] dp = new int[30][30];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++){
            String[] st = br.readLine().split(" ");
            int a = Integer.parseInt(st[0]);
            int b = Integer.parseInt(st[1]);
            System.out.println(combination(b,a));
        }

    }
    static int combination(int p, int q){

        if(dp[p][q] > 0){
            return dp[p][q];
        }

        if(p == q || q == 0){
            return dp[p][q] = 1;
        }

        return dp[p][q] = combination(p-1, q-1) + combination(p-1, q);
    }
}


