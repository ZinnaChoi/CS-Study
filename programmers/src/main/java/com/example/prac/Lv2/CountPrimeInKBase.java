package com.example.prac.Lv2;

public class CountPrimeInKBase {

    public int solution(int n, int k) {
        
        int answer = 0;
        for (String num : Integer.toString(n, k).split("0")){
            if (num.length() > 0){
                answer += isPrime(Long.parseLong(num)) ? 1 : 0;
            }
        }
        return answer;
    }
    
    private boolean isPrime(long num) {
        if (num < 2) return false;
        for (long i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    
}
