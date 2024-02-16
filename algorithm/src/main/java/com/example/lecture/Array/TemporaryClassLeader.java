package com.example.lecture.Array;

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class TemporaryClassLeader {

    public int mySolution(int N, int[][] data) {
        int maxCnt = 0;
        int leader = 1;
        for (int i = 0; i < N; i++) {
            Set<Integer> sameSet = new HashSet<>();
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < N; k++) {
                    if (k != i && data[k][j] == data[i][j])
                        sameSet.add(k);
                }
            }
            if (maxCnt < sameSet.size()) {
                leader = i + 1;
                maxCnt = sameSet.size();
            }
        }
        return leader;
    }

    public static void main(String[] args) {
        TemporaryClassLeader T = new TemporaryClassLeader();
        Scanner kb = new Scanner(System.in);

        int N = kb.nextInt();
        int[][] data = new int[N][5];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 5; j++) {
                data[i][j] = kb.nextInt();
            }
        }
        System.out.println(T.mySolution(N, data));
        kb.close();
    }
}
