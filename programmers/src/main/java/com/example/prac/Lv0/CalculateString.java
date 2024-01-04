package com.example.prac.Lv0;

public class CalculateString {

  public int solution(String my_string) {
    String[] parts = my_string.split(" ");

    int answer = Integer.parseInt(parts[0]);
    for (int i = 1; i < parts.length; i += 2) {
      if (parts[i].equals("+")) {
        answer += Integer.parseInt(parts[i + 1]);
      } else {
        answer -= Integer.parseInt(parts[i + 1]);
      }
    }
    return answer;
  }
}
