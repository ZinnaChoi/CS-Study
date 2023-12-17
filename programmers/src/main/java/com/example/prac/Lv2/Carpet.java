package com.example.prac.Lv2;

public class Carpet {
    public int[] solution(int brown, int yellow) {
        
        Boolean find = false;
        
        int m = 3;
        int n = 0;
        
        while (!find){
            n = (brown + 4) / 2 - m;
            if (n * m == brown + yellow){
                find = true;
                break;
            }
            m++;
        }
        
        int[] answer = {n , m};
        return answer;
    }
}
