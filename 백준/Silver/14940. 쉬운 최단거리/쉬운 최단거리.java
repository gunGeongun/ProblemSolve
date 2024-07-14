import java.io.*;
import java.util.*;

public class Main {
    private final static int[] dx = {1,0,-1,0};
    private final static int[] dy = {0,-1,0,1};
    private static int[][] map,distance;
    private static boolean[][] visited;
    private static int n,m;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] st = br.readLine().split(" ");
        n = Integer.parseInt(st[0]);
        m = Integer.parseInt(st[1]);

        boolean isStart = false;
        map = new int[n][m];
        distance = new int[n][m];
        visited = new boolean[n][m];
        int startX = -1,startY = -1;

        for(int i = 0;i<n;i++){
            map[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            if(!isStart){
                for(int j=0;j<m;j++){
                    if(map[i][j] == 2){
                        isStart = true;
                        startX = i;
                        startY = j;
                        break;
                    }
                }
            }
        }
        bfs(startX,startY);
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                if (!visited[i][j] && map[i][j] == 1)
                    builder.append(-1 + " ");
                else
                    builder.append(distance[i][j] + " ");
            builder.append("\n");
        }

        System.out.print(builder.toString());
        
    }
    public static void bfs(int x,int y){
        Queue<Point> q = new LinkedList<>();
        q.add(new Point(x,y));
        visited[x][y] = true;
        while(!q.isEmpty()){
            Point current = q.remove();
            for(int i=0;i<4;i++){
                int nextX = current.x + dx[i];
                int nextY = current.y + dy[i];

                if(nextX<0 || nextY<0 || nextX >= n || nextY >= m){
                    continue;
                }
                if(map[nextX][nextY] == 0){
                    continue;
                }
                if(visited[nextX][nextY]){
                    continue;
                }
                q.add(new Point(nextX,nextY));
                distance[nextX][nextY] = distance[current.x][current.y] + 1;
                visited[nextX][nextY] = true;
            }
        }
    }
}
class Point{
    int x;
    int y;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
}
