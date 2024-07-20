import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    private static int n, m;
    private static ArrayList<Integer>[] list;
    private static boolean[] visited;
    private static int[] result;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inp = br.readLine();

        StringTokenizer st = new StringTokenizer(inp);
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        list = new ArrayList[n + 1];

        result = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            list[i] = new ArrayList<>();
        }
        for (int i = 0; i < m; i++) {
            String[] input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);

            list[a].add(b);
        }

        for (int i = 1; i <= n; i++) {
            visited = new boolean[n + 1];
            Queue<Integer> q = new LinkedList<>();

            q.add(i);
            visited[i] = true;

            while (!q.isEmpty()) {
                int curNode = q.poll();
                for (int j : list[curNode]) {
                    if (!visited[j]) {
                        result[j]++;
                        visited[j] = true;
                        q.add(j);

                    }
                }
            }
        }

        int max = 0;
        for (int i = 1; i <= n; i++) {
            max = Math.max(max, result[i]);
        }

        StringBuffer sb = new StringBuffer();
        for (int i = 1; i <= n; i++) {
            if (max == result[i])
                sb.append(i + " ");
        }

        System.out.println(sb.toString().trim());

    }
    
}
