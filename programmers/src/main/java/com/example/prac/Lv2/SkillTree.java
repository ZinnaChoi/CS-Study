package com.example.prac.Lv2;

import java.util.LinkedList;
import java.util.Queue;

public class SkillTree {

  public int solution(String skill, String[] skill_trees) {
    int skillCnt = 0;

    for (String st : skill_trees) {
      String filteredStr = st.replaceAll("[^" + skill + "]", "");
      Queue<Character> q = new LinkedList<>();
      for (char c : skill.toCharArray()) {
        q.add(c);
      }
      skillCnt += isValidSkill(filteredStr, q);
    }

    return skillCnt;
  }

  private int isValidSkill(String filteredStr, Queue<Character> q) {
    int qSize = q.size();
    for (char f : filteredStr.toCharArray()) {
      if (f == q.peek()) q.poll();
    }

    if (q.size() == qSize - filteredStr.length()) return 1; else return 0;
  }
}
