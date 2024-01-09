package com.example.lecture.Recursive_Tree_Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TeacherBFSGraphShortestPath {

    static int n, m;
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static int[] ch, dis;

    public void BFS(int v) {

        Queue<Integer> queue = new LinkedList<>();
        ch[v] = 1;
        dis[v] = 0;
        queue.offer(v);

        while (!queue.isEmpty()) {
            int cv = queue.poll();
            for (int nv : graph.get(cv)) {
                if (ch[nv] == 0) {
                    ch[nv] = 1;
                    queue.offer(nv);
                    dis[nv] = dis[cv] + 1;
                }
            }

        }
    }

    public static void main(String[] args) {

        TeacherBFSGraphShortestPath T = new TeacherBFSGraphShortestPath();
        Scanner kb = new Scanner(System.in);

        n = kb.nextInt();
        m = kb.nextInt();

        // 인접 리스트 사용
        graph = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<Integer>());
        }

        ch = new int[n + 1];
        dis = new int[n + 1];

        for (int i = 0; i < m; i++) {
            int a = kb.nextInt();
            int b = kb.nextInt();
            graph.get(a).add(b);
        }

        T.BFS(1);

        for (int i = 2; i <= n; i++) {
            System.out.println(i + " : " + dis[i]);
        }
    }

}
