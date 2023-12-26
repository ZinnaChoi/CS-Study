package com.example.prac.Lv2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SkillTreeTest {

  @Test
  public void testSolution() {
    SkillTree skillTree = new SkillTree();

    String skill = "CBD";
    String[] skill_trees = { "BACDE", "CBADF", "AECB", "BDA" };
    int expected = 2;
    int result = skillTree.solution(skill, skill_trees);

    assertEquals(expected, result);
  }
}
