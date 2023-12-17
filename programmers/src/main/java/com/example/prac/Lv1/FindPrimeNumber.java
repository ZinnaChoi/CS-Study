package com.example.prac.Lv1;

public class FindPrimeNumber {
    public int solution(int n) {
        int cnt = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime(i))
                cnt++;
        }
        return cnt;
    }

    public boolean isPrime(int n) {
        boolean prime = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }
}
