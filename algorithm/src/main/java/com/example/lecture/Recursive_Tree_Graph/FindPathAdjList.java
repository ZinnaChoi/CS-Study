package com.example.lecture.Recursive_Tree_Graph;

import java.util.Scanner;

import java.util.ArrayList;

public class FindPathAdjList {

    static int n, m, cnt = 0;
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static int[] ch;

    public void DFS(int v) {
        if (v == n) {
            cnt++;
        } else {
            for (int g : graph.get(v)) {
                if (ch[g] == 0) {
                    ch[g] = 1;
                    DFS(g);
                    ch[g] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {

        FindPathAdjList T = new FindPathAdjList();
        Scanner kb = new Scanner(System.in);

        n = kb.nextInt();
        m = kb.nextInt();

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<Integer>());
        }
        ch = new int[n + 1];

        for (int i = 0; i < m; i++) {
            int a = kb.nextInt();
            int b = kb.nextInt();
            graph.get(a).add(b);
        }

        ch[1] = 1;
        T.DFS(1);
        System.out.println(cnt);

        kb.close();

    }

}
