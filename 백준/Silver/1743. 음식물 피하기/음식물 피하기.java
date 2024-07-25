import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    private static int[] dx = {1, 0, -1, 0};
    private static int[] dy = {0, -1, 0, 1};
    private static int[][] matrix;
    private static boolean[][] visited;
    private static int n, m, k;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] st = br.readLine().split(" ");
        n = Integer.parseInt(st[0]);
        m = Integer.parseInt(st[1]);
        k = Integer.parseInt(st[2]);

        matrix = new int[n + 1][m + 1];
        visited = new boolean[n + 1][m + 1];
        for (int i = 0; i < k; i++) {
            st = br.readLine().split(" ");
            int a = Integer.parseInt(st[0]);
            int b = Integer.parseInt(st[1]);

            matrix[a][b] = 1;

        }
        int num;
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (!visited[i][j] && matrix[i][j] == 1) {
                    num = bfs(i, j);
                    arr.add(num);
                }
            }
        }
        int max = Collections.max(arr);
        System.out.println(max + 1);


    }

    static int bfs(int sx, int sy) {
        Queue<Point> q = new LinkedList<>();
        q.add(new Point(sx, sy));
        visited[sx][sy] = true;
        int cnt = 0;
        while (!q.isEmpty()) {
            Point cur = q.poll();
            for (int i = 0; i < 4; i++) {
                int nx = cur.x + dx[i];
                int ny = cur.y + dy[i];

                if (nx < 0 || ny < 0 || nx > n || ny > m) {
                    continue;
                }
                if (visited[nx][ny] || matrix[nx][ny] == 0) {
                    continue;
                }
                visited[nx][ny] = true;
                cnt++;
                q.add(new Point(nx, ny));
            }
        }
        return cnt;

    }

}

class Point {
    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
