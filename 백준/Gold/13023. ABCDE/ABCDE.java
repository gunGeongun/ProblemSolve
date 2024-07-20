import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    private static int n, m;
    private static ArrayList<Integer>[] matrix;
    private static boolean[] visited;
    private static boolean arrive;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] st = br.readLine().split(" ");
        n = Integer.parseInt(st[0]);
        m = Integer.parseInt(st[1]);

        matrix = new ArrayList[n];
        visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            matrix[i] = new ArrayList<Integer>();
        }

        for (int i = 0; i < m; i++) {
            String[] input = br.readLine().split(" ");
            int x = Integer.parseInt(input[0]);
            int y = Integer.parseInt(input[1]);
            matrix[x].add(y);
            matrix[y].add(x);
        }

        for (int i = 0; i < n; i++) {
            dfs(i, 1);
            if (arrive) {
                break;
            }
        }
        if (arrive) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }


    }

    public static void dfs(int idx, int depth) {
        if (depth >= 5) {
            arrive = true;
            return;
        }
        visited[idx] = true;

        for (int i : matrix[idx]) {
            if (!visited[i]) {
                dfs(i, depth + 1);
            }
        }
        visited[idx] = false;
    }
}


