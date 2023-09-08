package baekjoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// https://www.acmicpc.net/problem/1260
public class B1260 {
    static int[][] graph = new int[1001][1001];
    static boolean[] visited; // 방문 여부
    static int n, m, v;  // n: 정점 m: 간선 v: 시작할 정점 번호


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int v = sc.nextInt();

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            graph[a][b] = graph[b][a] = 1;
        }
        visited = new boolean[n + 1];
        dfs(v);
        System.out.println();
        visited = new boolean[n + 1];
        bfs(v);
    }

    public static void dfs(int v) {
        visited[v] = true;
        System.out.print(v + " ");

        for (int i = 1; i < graph.length; i++) {
            if (graph[v][i] == 1 && visited[i] == false) {
                dfs(i);
            }
        }
    }

    public static void bfs(int v) {
        Queue<Integer> que = new LinkedList<>();
        que.add(v);
        visited[v] = true;
        System.out.print(v + " ");

        while (!que.isEmpty()) {
            int temp = que.poll();
            for(int i = 1; i< graph.length;i++){
                if(graph[temp][i] == 1 && visited[i] == false){
                    que.add(i);
                    visited[i] = true;
                    System.out.print(i + " ");
                }
            }
        }
    }
}
