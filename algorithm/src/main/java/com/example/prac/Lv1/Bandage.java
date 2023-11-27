package com.example.prac.Lv1;

public class Bandage {

  public int solution(int[] bandage, int health, int[][] attacks) {
    int life = health;
    int attackIdx = 0;
    int heal = 0;

    for (int i = 1; i <= attacks[attacks.length - 1][0]; i++) {
      if (i != attacks[attackIdx][0]) {
        life += bandage[1];
        heal++;
        if (heal == bandage[0]) {
          life += bandage[2];
          heal = 0;
        }
        if (life > health) life = health;
      } else {
        heal = 0;
        life -= attacks[attackIdx][1];
        attackIdx++;
        if (life <= 0) return -1;
      }
    }
    return life;
  }
}
