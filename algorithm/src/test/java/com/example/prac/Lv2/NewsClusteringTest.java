package com.example.prac.Lv2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class NewsClusteringTest {

  @Test
  public void testSolution() {
    NewsClustering newsClustering = new NewsClustering();

    // Test Case 1
    int result1 = newsClustering.solution("FRANCE", "french");
    assertEquals(16384, result1);

    // Test Case 2
    int result2 = newsClustering.solution("handshake", "shake hands");
    assertEquals(65536, result2);

    // Test Case 3
    int result3 = newsClustering.solution("aa1+aa2", "AAAA12");
    assertEquals(43690, result3);

    // Test Case 4
    int result4 = newsClustering.solution("E=M*C^2", "e=m*c^2");
    assertEquals(65536, result4);
  }
}
