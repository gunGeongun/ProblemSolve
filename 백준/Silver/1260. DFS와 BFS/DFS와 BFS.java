import java.io.*;
import java.util.*;

public class Main {

    static boolean[] visited;
    static int[][] matrix;
    static int n;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m,v;
        String[] st = br.readLine().split(" ");
        n = Integer.parseInt(st[0]);
        m = Integer.parseInt(st[1]);
        v = Integer.parseInt(st[2]);
        visited = new boolean[n];
        matrix = new int[n][n];
        for(int i =0;i<m;i++){
            st = br.readLine().split(" ");
            int start = Integer.parseInt(st[0]);
            int end = Integer.parseInt(st[1]);
            matrix[start-1][end-1] = 1;
            matrix[end-1][start-1] = 1;

        }
        dfs(v-1);
        Arrays.fill(visited,false);
        System.out.println();
        bfs(v-1);
    }
    public static void dfs(int index){
        visited[index] = true;
        System.out.print(index+1 + " ");
        for(int i = 0;i<n;i++){
            if(!visited[i] && matrix[index][i] != 0){
                dfs(i);
            }
        }
    }
    public static void bfs(int index){
        Queue<Integer> queue = new LinkedList<>();
        visited[index] = true;

        queue.add(index);
        while(!queue.isEmpty()){
            int nodeidx = queue.remove();
            System.out.print(nodeidx+1 + " ");
            for(int i =0;i<n;i++){
                if(!visited[i] && matrix[nodeidx][i] != 0){
                    visited[i] = true;
                    queue.add(i);
                }
            }

        }
    }
}
