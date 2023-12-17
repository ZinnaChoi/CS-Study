package com.example.prac.Lv2;

public class Fibonacci {
    public int solution(int n) {
        
        int[] Fibo = new int[n+1];
        
        Fibo[0] = 0;
        Fibo[1] = 1;

        for (int i = 2; i <= n; i++){
            Fibo[i] = (Fibo[i-1] + Fibo[i-2]) % 1234567 ;
        }
        
        
        return Fibo[n] ;
    }
}
