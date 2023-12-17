package com.example.prac.Lv1;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class OrganizeDesktopTest {

  @Test
  public void testSolution() {
    OrganizeDesktop organizeDesktop = new OrganizeDesktop();

    // Test case 1
    String[] wallpaper1 = { ".#...", "..#..", "...#." };
    int[] expected1 = { 0, 1, 3, 4 };
    assertArrayEquals(expected1, organizeDesktop.solution(wallpaper1));

    // Test case 2
    String[] wallpaper2 = {
      "..........",
      ".....#....",
      "......##..",
      "...##.....",
      "....#.....",
    };
    int[] expected2 = { 1, 3, 5, 8 };
    assertArrayEquals(expected2, organizeDesktop.solution(wallpaper2));

    // Test case 3
    String[] wallpaper3 = {
      ".##...##.",
      "#..#.#..#",
      "#...#...#",
      ".#.....#.",
      "..#...#..",
      "...#.#...",
      "....#....",
    };
    int[] expected3 = { 0, 0, 7, 9 };
    assertArrayEquals(expected3, organizeDesktop.solution(wallpaper3));

    // Test case 4
    String[] wallpaper4 = { "..", "#." };
    int[] expected4 = { 1, 0, 2, 1 };
    assertArrayEquals(expected4, organizeDesktop.solution(wallpaper4));
  }
}
