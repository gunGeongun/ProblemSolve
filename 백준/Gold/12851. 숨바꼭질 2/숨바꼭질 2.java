import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static int s, k;
    public static int[] visited = new int[100001];
    public static int min = 999999;
    public static int cnt = 0;


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] st = br.readLine().split(" ");
        s = Integer.parseInt(st[0]);
        k = Integer.parseInt(st[1]);

        if (s >= k) {
            System.out.println((s - k) + "\n1");
            return;
        }

        bfs(s);
        System.out.println(min + "\n" + cnt);


    }

    public static void bfs(int startNode) {
        Queue<Integer> q = new LinkedList<>();
        q.add(startNode);
        visited[startNode] = 1;
        while (!q.isEmpty()) {
            int n = q.poll();
            if (min < visited[n]) {
                return;
            }
            for (int i = 0; i < 3; i++) {
                int next;
                if (i == 0) {
                    next = n - 1;
                } else if (i == 1) {
                    next = n + 1;
                } else {
                    next = n * 2;
                }
                if (next < 0 || next > 100000) continue;


                if (next == k) {
                    min = visited[n];
                    cnt++;
                }

                if (visited[next] == 0 || visited[next] == visited[n] + 1) {
                    visited[next] = visited[n] + 1;
                    q.add(next);
                }
            }

        }
    }
}

