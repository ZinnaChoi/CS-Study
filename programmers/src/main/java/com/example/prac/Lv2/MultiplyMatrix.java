package com.example.prac.Lv2;

public class MultiplyMatrix {

  public int[][] solution(int[][] arr1, int[][] arr2) {
    int[][] answer = new int[arr1.length][arr2[0].length];

    for (int i = 0; i < arr1.length; i++) {
      for (int j = 0; j < arr2[0].length; j++) {
        for (int w = 0; w < arr2.length; w++) {
          answer[i][j] += arr1[i][w] * arr2[w][j];
        }
      }
    }

    return answer;
  }
}
