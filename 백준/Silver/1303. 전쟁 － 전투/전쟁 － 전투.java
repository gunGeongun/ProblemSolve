import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    private static int[] dx = {1, 0, -1, 0};
    private static int[] dy = {0, -1, 0, 1};
    private static int[][] matrix;
    private static boolean[][] visited;
    private static int n, m;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] st = br.readLine().split(" ");
        m = Integer.parseInt(st[0]);
        n = Integer.parseInt(st[1]);
        matrix = new int[n][m];
        visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            for (int j = 0; j < m; j++) {
                if (input.charAt(j) == 'W') {
                    matrix[i][j] = 0;
                } else {
                    matrix[i][j] = 1;
                }
            }
        }
        int wCount = 0;
        int bCount = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (!visited[i][j]) {
                    if (matrix[i][j] == 0) {
                        int wcnt = bfs(i, j, 0);
                        wCount += wcnt * wcnt;

                    }
                    if (matrix[i][j] == 1) {
                        int bcnt = bfs(i, j, 1);
                        bCount += bcnt * bcnt;

                    }
                }
            }

        }
        System.out.println(wCount + " " + bCount);
    }

    static int bfs(int sx, int sy, int point) {
        Queue<Point> q = new LinkedList<>();
        visited[sx][sy] = true;
        q.add(new Point(sx, sy));
        int cnt = 1;
        while (!q.isEmpty()) {
            Point current = q.poll();
            for (int i = 0; i < 4; i++) {
                int nx = current.x + dx[i];
                int ny = current.y + dy[i];
                if (nx < 0 || ny < 0 || nx >= n || ny >= m) {
                    continue;
                }
                if (point == 0) {
                    if (visited[nx][ny] || matrix[nx][ny] == 1) {
                        continue;
                    }
                } else {
                    if (visited[nx][ny] || matrix[nx][ny] == 0) {
                        continue;
                    }
                }
                cnt++;
                visited[nx][ny] = true;
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
