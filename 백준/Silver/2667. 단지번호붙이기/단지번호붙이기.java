import java.io.*;
import java.util.*;

public class Main {
    public static int[] dx = {1, 0, -1, 0};
    public static int[] dy = {0, -1, 0, 1};
    public static int[][] map;
    public static ArrayList<Integer> result;
    public static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        map = new int[n][n];
        result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            for (int j = 0; j < n; j++) {
                map[i][j] = input.charAt(j) - '0';
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (map[i][j] == 1) {
                    result.add(bfs(i, j));
                }
            }
        }
        Collections.sort(result);
        System.out.println(result.size());
        for (int num : result) {
            System.out.println(num);
        }

    }

    public static int bfs(int x, int y) {
        Queue<Point> q = new LinkedList<>();

        q.add(new Point(x, y));
        map[x][y] = 0;
        int count = 1;
        while (!q.isEmpty()) {
            Point current = q.remove();
            for (int i = 0; i < 4; i++) {
                int nextX = current.x + dx[i];
                int nextY = current.y + dy[i];

                if (nextX < 0 || nextY < 0 || nextX >= n || nextY >= n) {
                    continue;
                }
                if (map[nextX][nextY] == 1) {
                    map[nextX][nextY] = 0;
                    q.add(new Point(nextX, nextY));
                    count += 1;
                }
            }
        }
        return count;
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
