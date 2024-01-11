package com.example.lecture.Array;

import java.util.Scanner;

public class PrimeNumber {

    public int mySolution(int N) {
        int cnt = 0;
        for (int i = 2; i <= N; i++) {
            if (isPrime(i))
                cnt++;
        }
        return cnt;
    }

    public boolean isPrime(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int teacherSolution(int n) {
        int answer = 0;
        int[] ch = new int[n + 1];
        for (int i = 2; i <= n; i++) {
            if (ch[i] == 0) {
                answer++;
                for (int j = i; j <= n; j += i) {
                    ch[j] = 1;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        PrimeNumber T = new PrimeNumber();
        Scanner kb = new Scanner(System.in);

        int N = kb.nextInt();
        System.out.println(T.mySolution(N));
        // System.out.println(T.teacherSolution(N));
        kb.close();
    }

}
