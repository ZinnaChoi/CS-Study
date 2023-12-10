package com.example.prac.Lv2;

public class Fatigue {

  public int solution(int k, int[][] dungeons) {
    return exploreDungeons(
      k,
      dungeons,
      new boolean[dungeons.length],
      new int[dungeons.length],
      0
    );
  }

  private int exploreDungeons(
    int remainingFatigue,
    int[][] dungeons,
    boolean[] visited,
    int[] order,
    int depth
  ) {
    if (depth == dungeons.length) {
      int count = 0;
      for (int i : order) {
        if (remainingFatigue >= dungeons[i][0]) {
          remainingFatigue -= dungeons[i][1];
          count++;
        } else {
          break;
        }
      }
      return count;
    }

    int maxCount = 0;

    for (int i = 0; i < dungeons.length; i++) {
      if (!visited[i]) {
        visited[i] = true;
        order[depth] = i;
        int count = exploreDungeons(
          remainingFatigue,
          dungeons,
          visited,
          order,
          depth + 1
        );
        maxCount = Math.max(maxCount, count);
        visited[i] = false;
      }
    }

    return maxCount;
  }
}
