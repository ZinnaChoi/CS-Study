package com.example.prac.Lv1;

public class NeighborCell {

  public int solution(String[][] board, int h, int w) {
    int cnt = 0;
    int n = board.length;

    int[][] directions = { { 0, 1 }, { 1, 0 }, { -1, 0 }, { 0, -1 } };

    for (int[] dir : directions) {
      int h_check = h + dir[0];
      int w_check = w + dir[1];

      if (h_check >= 0 && h_check < n && w_check >= 0 && w_check < n) {
        if (board[h][w].equals(board[h_check][w_check])) {
          cnt++;
        }
      }
    }
    return cnt;
  }
}
