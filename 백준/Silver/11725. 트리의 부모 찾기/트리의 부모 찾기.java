import java.io.*;
import java.util.*;

public class Main {
    static boolean[] visited;
    static ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
    static int n;
    static int[] parent;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        for(int i= 0;i<n;i++){
            matrix.add(new ArrayList<>());
        }
        visited = new boolean[n+1];
        parent = new int[n+1];
        for(int i =1;i<n;i++){
            String[] st = br.readLine().split(" ");
            int start = Integer.parseInt(st[0]) -1 ;
            int end = Integer.parseInt(st[1]) - 1;
            matrix.get(start).add(end);
            matrix.get(end).add(start);
        }
        bfs(0);
        for(int result : parent){
            if(result != 0){
                System.out.println(result);
            }
        }
    }
    public static void bfs(int index){
        Queue<Integer> queue = new LinkedList<>();
        visited[index] = true;
        queue.add(index);
        while(!queue.isEmpty()){
            int nodeidx = queue.remove();
            for(int i : matrix.get(nodeidx))
                if(!visited[i]){
                    visited[i] = true;
                    parent[i] = nodeidx+1;
                    queue.add(i);
                }

        }
    }

}
