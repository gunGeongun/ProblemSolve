import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    static ArrayList<Node>[] arr;
    static boolean[] visited;
    static int[] distance;
    static int v;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        v = Integer.parseInt(br.readLine());
        arr = new ArrayList[v+1];
        for(int i=1;i<=v;i++){
            arr[i] = new ArrayList<Node>();
        }
        for(int i =1;i<=v;i++){
            String[] st = br.readLine().split(" ");
            int startNode = Integer.parseInt(st[0]);
            int m = 1;
            while(true){
                int node = Integer.parseInt(st[m]);
                if(node == -1){
                    break;
                }
                m += 1;
                int distance = Integer.parseInt(st[m]);
                Node newNode = new Node(node, distance);
                arr[startNode].add(newNode);
                m += 1;
            }
        }
        distance = new int[v+1];
        visited = new boolean[v+1];

        bfs(1);
        int max = 1;
        for(int i = 2;i<=v;i++){
            if(distance[max] < distance[i]){
                max = i;
            }
        }
        distance = new int[v+1];
        visited = new boolean[v+1];
        bfs(max);

        Arrays.sort(distance);
        System.out.println(distance[v]);



    }
    public static void bfs(int index){
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(index);
        visited[index] = true;
        while(!queue.isEmpty()){
            int nowNode = queue.poll();
            for(Node i : arr[nowNode]){
                if(!visited[i.node]){
                    visited[i.node] = true;
                    queue.add(i.node);

                    distance[i.node] = distance[nowNode] + i.distance;
                }
            }
        }

    }
}
class Node{
    int node;
    int distance;
    Node(int node, int distance){
        this.node = node;
        this.distance = distance;
    }

}
