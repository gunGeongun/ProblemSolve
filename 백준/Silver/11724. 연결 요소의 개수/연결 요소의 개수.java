import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    private static int[][] matrix;
    private static boolean[] visited;
    private static int n, m;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] st = br.readLine().split(" ");
        n = Integer.parseInt(st[0]);
        m = Integer.parseInt(st[1]);

        matrix = new int[n][n];
        visited = new boolean[n];

        for (int i = 0; i < m; i++) {
            String[] input = br.readLine().split(" ");
            int x = Integer.parseInt(input[0]) - 1;
            int y = Integer.parseInt(input[1]) - 1;

            matrix[x][y] = 1;
            matrix[y][x] = 1;
        }
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(i);
                cnt++;
            }
        }
        System.out.println(cnt);
    }

    public static void dfs(int idx) {
        visited[idx] = true;

        for (int i = 0; i < n; i++) {
            if (!visited[i] && matrix[idx][i] != 0) {
                dfs(i);
            }
        }
    }
}


