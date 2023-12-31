package com.example.prac.Lv2;

public class FourFreindsBlock {

  public int solution(int m, int n, String[] board) {
    char[][] map = new char[m][n];
    for (int i = 0; i < m; i++) {
      map[i] = board[i].toCharArray();
    }

    int count = 0;

    while (true) {
      boolean[][] isPoped = new boolean[m][n];
      boolean found = false;

      for (int i = 0; i < m - 1; i++) {
        for (int j = 0; j < n - 1; j++) {
          char block = map[i][j];
          if (
            block != ' ' &&
            block == map[i][j + 1] &&
            block == map[i + 1][j] &&
            block == map[i + 1][j + 1]
          ) {
            isPoped[i][j] =
              isPoped[i][j + 1] =
                isPoped[i + 1][j] = isPoped[i + 1][j + 1] = true;
            found = true;
          }
        }
      }

      if (!found) break;

      for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
          if (isPoped[i][j]) {
            map[i][j] = ' ';
            count++;
          }
        }
      }

      for (int j = 0; j < n; j++) {
        for (int i = m - 1; i >= 0; i--) {
          if (map[i][j] == ' ') {
            int k = i;
            while (k >= 0 && map[k][j] == ' ') {
              k--;
            }
            if (k >= 0) {
              map[i][j] = map[k][j];
              map[k][j] = ' ';
            }
          }
        }
      }
    }
    return count;
  }
}
