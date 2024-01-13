package com.example.lecture.DFS_BFS;

import java.util.Scanner;

public class LoadDogIntoCar {

    public static int C;
    public static int N;
    public static int[] dogs;
    public static int maxWeight = 0;

    public void DFS(int L, int weightSum) {
        if (L == N) {
            if (weightSum > maxWeight && weightSum <= C)
                maxWeight = weightSum;
            return;
        } else {
            DFS(L + 1, weightSum + dogs[L]);
            DFS(L + 1, weightSum);
        }
    }

    public static void main(String[] args) {

        LoadDogIntoCar T = new LoadDogIntoCar();
        Scanner kb = new Scanner(System.in);

        C = kb.nextInt();
        N = kb.nextInt();

        dogs = new int[N];
        for (int i = 0; i < N; i++) {
            dogs[i] = kb.nextInt();
        }
        T.DFS(0, 0);
        System.out.println(maxWeight);

        kb.close();
    }
}
