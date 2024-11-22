import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    static int n, m, k, x;
    static ArrayList<Integer>[] matrix;
    static boolean[] visited;
    static int[] distance;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] st= br.readLine().split(" ");

        n = Integer.parseInt(st[0]);
        m = Integer.parseInt(st[1]);
        k = Integer.parseInt(st[2]);
        x = Integer.parseInt(st[3]);

        matrix = new ArrayList[n+1];

        for(int i = 1; i<n+1; i++){
            matrix[i] = new ArrayList<>();
        }

        for(int i = 0; i<m; i++){
            st = br.readLine().split(" ");
            int a = Integer.parseInt(st[0]);
            int b = Integer.parseInt(st[1]);

            matrix[a].add(b);
        }
        visited = new boolean[n+1];
        distance = new int[n+1];

        bfs(x);

        boolean isExist = false;

        for(int i = 1 ; i<n+1; i++){
            if(distance[i] == k){
                System.out.println(i);
                isExist = true;
            }
        }
        if(!isExist){
            System.out.println(-1);
        }

    }
    public static void bfs(int start){
        Queue<Integer> q = new LinkedList<>();

        q.add(start);
        visited[start] = true;

        while(!q.isEmpty()){
            int cur = q.poll();
            for(int i : matrix[cur]){
                if(!visited[i]){
                    visited[i] = true;
                    q.add(i);
                    distance[i] = distance[cur] + 1;
                }
            }
        }
    }

}