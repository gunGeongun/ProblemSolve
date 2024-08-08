import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    private static int[] dx = {0, -1, 0, 1};
    private static int[] dy = {-1, 0, 1, 0};
    private static int[][] matrix;
    private static boolean[][] visited;
    private static int m, n;
    private static Queue<Point> q = new LinkedList<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] st = br.readLine().split(" ");
        m = Integer.parseInt(st[0]);
        n = Integer.parseInt(st[1]);

        matrix = new int[n][m];
        visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            st = br.readLine().split(" ");
            for (int j = 0; j < m; j++) {
                matrix[i][j] = Integer.parseInt(st[j]);
            }
        }


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 1) {
                    q.add(new Point(i, j, 0));
                }
            }
        }
        bfs();
    }

    public static void bfs() {
        int day = 0;
        while (!q.isEmpty()) {
            Point cur = q.poll();
            day = cur.day;
            for (int i = 0; i < 4; i++) {
                int nx = cur.x + dx[i];
                int ny = cur.y + dy[i];

                if (nx < 0 || ny < 0 || nx >= n || ny >= m) {
                    continue;
                }
                if (matrix[nx][ny] == 0) {
                    q.add(new Point(nx, ny, day + 1));
                    matrix[nx][ny] = 1;
                }
            }
        }
        if (check()) {
            System.out.println(day);
        } else {
            System.out.println(-1);
        }

    }

    static class Point {
        int x;
        int y;
        int day;

        Point(int x, int y, int day) {
            this.x = x;
            this.y = y;
            this.day = day;
        }
    }

    static boolean check() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    return false;
                }
            }
        }
        return true;
    }

}

