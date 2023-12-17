package com.example.prac.Lv1;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class DataCollectionExpiryTest {

  @Test
  public void testSolution() {
    DataCollectionExpiry dataCollectionExpiry = new DataCollectionExpiry();
    String today1 = "2022.05.19";
    String[] terms1 = { "A 6", "B 12", "C 3" };
    String[] privacies1 = {
      "2021.05.02 A",
      "2021.07.01 B",
      "2022.02.19 C",
      "2022.02.20 C",
    };
    int[] expectedResult1 = { 1, 3 };
    int[] result1 = dataCollectionExpiry.solution(today1, terms1, privacies1);
    assertArrayEquals(expectedResult1, result1);

    String today2 = "2020.01.01";
    String[] terms2 = { "Z 3", "D 5" };
    String[] privacies2 = {
      "2019.01.01 D",
      "2019.11.15 Z",
      "2019.08.02 D",
      "2019.07.01 D",
      "2018.12.28 Z",
    };
    int[] expectedResult2 = { 1, 4, 5 };
    int[] result2 = dataCollectionExpiry.solution(today2, terms2, privacies2);
    assertArrayEquals(expectedResult2, result2);
  }
}
