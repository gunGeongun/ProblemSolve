import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    private static int w, h;
    private static int[][] matrix;
    private static boolean[][] visited;
    private static Queue<Point> q = new LinkedList<>();
    private static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
    private static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String[] st = br.readLine().split(" ");
            w = Integer.parseInt(st[0]);
            h = Integer.parseInt(st[1]);
            if (w == 0 && h == 0) {
                break;
            }
            matrix = new int[h][w];
            visited = new boolean[h][w];
            for (int i = 0; i < h; i++) {
                st = br.readLine().split(" ");
                for (int j = 0; j < w; j++) {
                    matrix[i][j] = Integer.parseInt(st[j]);
                }
            }
            int cnt = 0;
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if (matrix[i][j] == 1 && !visited[i][j]) {
                        bfs(i, j);
                        cnt++;
                    }
                }
            }
            System.out.println(cnt);
        }
    }

    static void bfs(int x, int y) {
        q.add(new Point(x, y));
        visited[x][y] = true;
        while (!q.isEmpty()) {
            Point cur = q.poll();
            for (int i = 0; i < 8; i++) {
                int nx = cur.x + dx[i];
                int ny = cur.y + dy[i];
                if (nx < 0 || ny < 0 || nx >= h || ny >= w) {
                    continue;
                }
                if (matrix[nx][ny] == 1 && !visited[nx][ny]) {
                    q.add(new Point(nx, ny));
                    visited[nx][ny] = true;
                }
            }
        }

    }

    static class Point {
        int x;
        int y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

}

