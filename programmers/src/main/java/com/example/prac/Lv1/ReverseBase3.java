package com.example.prac.Lv1;

public class ReverseBase3 {
    public int solution(int n) {

        String reverseBase3 = Integer.toString(n, 3);
        StringBuilder sb = new StringBuilder(reverseBase3);
        int idx = reverseBase3.length();

        int answer = 0; // 10진법 수
        for (String s : sb.reverse().toString().split("")) {
            answer += Integer.parseInt(s) * Math.pow(3, idx - 1);
            idx--;
        }

        return answer;
    }
}
