import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static int m, n, h;
    public static int[][][] matrix;
    public static Queue<Point> q = new LinkedList<>();
    public static int[] dx = {0, 0, -1, 1, 0, 0};
    public static int[] dy = {-1, 1, 0, 0, 0, 0};
    public static int[] dz = {0, 0, 0, 0, 1, -1};


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] st = br.readLine().split(" ");
        m = Integer.parseInt(st[0]);
        n = Integer.parseInt(st[1]);
        h = Integer.parseInt(st[2]);
        matrix = new int[h][n][m];

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < n; j++) {
                st = br.readLine().split(" ");
                for (int z = 0; z < m; z++) {
                    matrix[i][j][z] = Integer.parseInt(st[z]);
                }
            }
        }
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < n; j++) {
                for (int z = 0; z < m; z++) {
                    if (matrix[i][j][z] == 1) {
                        q.add(new Point(j, z, i, 0));
                    }
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
            for (int i = 0; i < 6; i++) {
                int nx = cur.x + dx[i];
                int ny = cur.y + dy[i];
                int nz = cur.z + dz[i];

                if (nx < 0 || ny < 0 || nz < 0 || nx >= n || ny >= m || nz >= h) {
                    continue;
                }
                if (matrix[nz][nx][ny] == 0) {
                    q.add(new Point(nx, ny, nz, day + 1));
                    matrix[nz][nx][ny] = 1;
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
        int z;
        int day;

        Point(int x, int y, int z, int day) {
            this.x = x;
            this.y = y;
            this.z = z;
            this.day = day;
        }
    }

    static boolean check() {
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < n; j++) {
                for (int z = 0; z < m; z++) {
                    if (matrix[i][j][z] == 0) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}

