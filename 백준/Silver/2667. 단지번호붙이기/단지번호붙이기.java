import java.io.*;
import java.util.*;

public class Main {
    static int[][] matrix;
    static int n;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    static ArrayList<Integer> result;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] st = br.readLine().split(" ");

        n = Integer.parseInt(st[0]);

        matrix = new int[n][n];
        result = new ArrayList<>();

        for(int i = 0; i < n; i++){
            String inp = br.readLine();

            for(int j = 0; j < n; j++){
                matrix[i][j] = inp.charAt(j) - '0';
            }

        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(matrix[i][j] == 1){
                    result.add(bfs(i, j));
                }
            }
        }
        Collections.sort(result);
        System.out.println(result.size());
        for(int i : result){
            System.out.println(i);
        }
    }
    public static int bfs(int x, int y){
        Queue<Point> q = new LinkedList<>();
        q.add(new Point(x, y));
        matrix[x][y] = 0;
        int count = 1;
        while(!q.isEmpty()){
            Point current = q.poll();

            for(int i = 0; i < 4; i++){
                int nextX = current.x + dx[i];
                int nextY = current.y + dy[i];

                if(nextX < 0 || nextY < 0 || nextX >= n || nextY >= n){
                    continue;
                }

                if(matrix[nextX][nextY] == 1){
                    matrix[nextX][nextY] = 0;
                    q.add(new Point(nextX, nextY));
                    count += 1;
                }
            }
        }
        return count;
    }
}
class Point{
    int x;
    int y;
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
}
