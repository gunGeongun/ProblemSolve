import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    static int arr[], list[];
    static int n, m;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        n = Integer.parseInt(input[0]);
        m = Integer.parseInt(input[1]);
        input = br.readLine().split(" ");

        list = new int[n];
        arr = new int[m];

        for (int i = 0; i < n; i++) {
            list[i] = Integer.parseInt(input[i]);
        }
        Arrays.sort(list);  

        dfs(0, 0);
        System.out.print(sb);
    }

    static void dfs(int depth, int start) {
        if (depth == m) {
            for (int i = 0; i < m; i++) {
                sb.append(arr[i]).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = start; i < n; i++) {
            arr[depth] = list[i];
            dfs(depth + 1, i + 1);  
        }
    }
}
