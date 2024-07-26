import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static int s, k;
    public static int visited[] = new int[1000001];


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] st = br.readLine().split(" ");
        s = Integer.parseInt(st[0]);
        k = Integer.parseInt(st[1]);

        System.out.println(bfs(s));


    }

    public static int bfs(int startNode) {
        Queue<Integer> q = new LinkedList<>();
        q.add(startNode);
        visited[startNode] = 1;
        while (!q.isEmpty()) {
            int n = q.poll();
            if (n == k) {
                return visited[n] - 1;
            }
            if (n - 1 >= 0 && visited[n - 1] == 0) {
                visited[n - 1] = visited[n] + 1;
                q.add(n - 1);
            }
            if (n + 1 <= 100000 && visited[n + 1] == 0) {
                visited[n + 1] = visited[n] + 1;
                q.add(n + 1);
            }
            if (n * 2 <= 100000 && visited[n * 2] == 0) {
                visited[n * 2] = visited[n] + 1;
                q.add(n * 2);
            }

        }
        return -1;


    }


}

