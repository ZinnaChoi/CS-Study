package com.example.prac.Lv2;

import java.util.Arrays;

public class LCMOfMultipleNumbers {

  public int solution(int[] arr) {
    int num = Arrays.stream(arr).max().orElse(1);

    while (true) {
      boolean isLCM = true;
      for (int a : arr) {
        if (num % a != 0) {
          isLCM = false;
          break;
        }
      }
      if (isLCM) {
        break;
      }
      num++;
    }
    return num;
  }
}
