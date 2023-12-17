package com.example.prac.Lv2;

public class SliceArray {

  public int[] solution(int n, long left, long right) {
    int[] answer = new int[(int) (right - left) + 1];

    int idx = 0;
    for (long i = left; i <= right; i++) {
      long row = i / n;
      long col = i % n;
      answer[idx++] = (int) (Math.max(row, col) + 1);
    }

    return answer;
  }
}
