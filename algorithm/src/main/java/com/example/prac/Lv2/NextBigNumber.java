package com.example.prac.Lv2;

public class NextBigNumber {

  public int solution(int n) {
    Boolean found = false;
    int nOneCount = cntOne(n);

    while (!found) {
      n++;
      if (cntOne(n) == nOneCount) {
        found = true;
      }
    }
    return n;
  }

  private int cntOne(int n) {
    int oneCnt = 0;
    for (char c : Integer.toString(n, 2).toCharArray()) {
      if (c == '1') {
        oneCnt++;
      }
    }
    return oneCnt;
  }
}
