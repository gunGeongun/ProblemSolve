import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] sp = br.readLine().split(" ");
        int n = Integer.parseInt(sp[0]);
        int m = Integer.parseInt(sp[1]);
        int[][] arr = new int[n + 1][n + 1];
        int[][] sumArr = new int[n + 1][n + 1];
        for (int i = 1; i <= n; i++) {
            String[] token = br.readLine().split(" ");
            for (int j = 1; j <= n; j++) {
                arr[i][j] = Integer.parseInt(token[j - 1]);
            }
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                sumArr[i][j] = sumArr[i - 1][j] + sumArr[i][j - 1]
                        - sumArr[i - 1][j - 1] + arr[i][j];

            }
        }
        int x1, x2, y1, y2;
        for (int i = 0; i < m; i++) {
            String[] token = br.readLine().split(" ");
            x1 = Integer.parseInt(token[0]);
            y1 = Integer.parseInt(token[1]);
            x2 = Integer.parseInt(token[2]);
            y2 = Integer.parseInt(token[3]);
            int result = sumArr[x2][y2] - sumArr[x2][y1-1] - sumArr[x1-1][y2] +
                    sumArr[x1-1][y1-1];
            System.out.println(result);
        }


    }

}