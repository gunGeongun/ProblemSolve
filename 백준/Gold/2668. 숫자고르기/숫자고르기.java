import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int n;
    static int[] num;
    static ArrayList<Integer> arr;
    static boolean[] visited;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        num = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            num[i] = Integer.parseInt(br.readLine());
        }

        arr = new ArrayList<>();
        visited = new boolean[n + 1];

        for (int i = 1; i <= n; i++) {
            visited[i] = true;
            dfs(i, i);
            visited[i] = false;
        }
        Collections.sort(arr);
        System.out.println(arr.size());
        for (int i : arr) {
            System.out.println(i);
        }


    }

    static void dfs(int start, int target) {
        if (visited[num[start]] == false) {
            visited[num[start]] = true;
            dfs(num[start], target);
            visited[num[start]] = false;
        }

        if (num[start] == target) {
            arr.add(num[start]);
        }
    }


}

