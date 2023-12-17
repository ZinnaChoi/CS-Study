package com.example.prac.Lv1;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class ReceiveReportResultTest {

  @Test
  public void testSolution() {
    ReceiveReportResult receiveReportResult = new ReceiveReportResult();
    String[] id_list1 = { "muzi", "frodo", "apeach", "neo" };
    String[] report1 = {
      "muzi frodo",
      "apeach frodo",
      "frodo neo",
      "muzi neo",
      "apeach muzi",
    };
    int k1 = 2;
    int[] expected1 = { 2, 1, 1, 0 };
    assertArrayEquals(
      expected1,
      receiveReportResult.solution(id_list1, report1, k1)
    );

    String[] id_list2 = { "con", "ryan" };
    String[] report2 = { "ryan con", "ryan con", "ryan con", "ryan con" };
    int k2 = 3;
    int[] expected2 = { 0, 0 };
    assertArrayEquals(
      expected2,
      receiveReportResult.solution(id_list2, report2, k2)
    );
  }
}
