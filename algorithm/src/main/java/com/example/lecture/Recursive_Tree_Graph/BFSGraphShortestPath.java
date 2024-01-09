package com.example.lecture.Recursive_Tree_Graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFSGraphShortestPath {

    static int N, M;
    static int[][] graph;

    public int BFS(int start, int target) {

        Queue<Integer> Q = new LinkedList<>();
        Q.offer(start);
        int[] distance = new int[N + 1];
        distance[start] = 0;

        while (!Q.isEmpty()) {
            int cur = Q.poll();
            if (cur == target)
                return distance[target];
            for (int i = 1; i <= N; i++) {
                if (graph[cur][i] == 1 && distance[i] == 0) {
                    Q.offer(i);
                    distance[i] = distance[cur] + 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        BFSGraphShortestPath T = new BFSGraphShortestPath();
        Scanner kb = new Scanner(System.in);

        N = kb.nextInt();
        M = kb.nextInt();

        graph = new int[N + 1][N + 1];

        for (int i = 0; i < M; i++) {
            int from = kb.nextInt();
            int to = kb.nextInt();
            graph[from][to] = 1;
        }

        for (int i = 2; i <= N; i++) {
            System.out.println(String.format("%d: %d", i, T.BFS(1, i)));
        }

        kb.close();
    }
}
