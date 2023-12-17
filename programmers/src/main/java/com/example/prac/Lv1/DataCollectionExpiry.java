package com.example.prac.Lv1;

import java.util.*;

public class DataCollectionExpiry {

  public int[] solution(String today, String[] terms, String[] privacies) {
    List<Integer> answer = new ArrayList<>();

    String[] todayList = today.split("\\.");

    int todayYear = Integer.parseInt(todayList[0]);
    int todayMonth = Integer.parseInt(todayList[1]);
    int todayDate = Integer.parseInt(todayList[2]);

    Map<String, Integer> termsMap = new HashMap<>();

    for (String t : terms) {
      termsMap.put(t.split(" ")[0], Integer.parseInt(t.split(" ")[1]));
    }

    int idx = 1;
    for (String p : privacies) {
      String startDay = p.split(" ")[0];
      int startYear = Integer.parseInt(startDay.split("\\.")[0]);
      int startMonth = Integer.parseInt(startDay.split("\\.")[1]);
      int startDate = Integer.parseInt(startDay.split("\\.")[2]);

      String term = p.split(" ")[1];

      int sumMonth = startMonth + termsMap.get(term);

      int expiredDate = startDate - 1;
      if (expiredDate == 0) {
        sumMonth--;
        expiredDate = 28;
      }
      int expiredYear = startYear + sumMonth / 12;
      int expiredMonth = sumMonth % 12;

      if (expiredMonth == 0) {
        expiredYear--;
        expiredMonth = 12;
      }

      if (
        expiredYear < todayYear ||
        (expiredYear == todayYear && expiredMonth < todayMonth) ||
        (
          expiredYear == todayYear &&
          expiredMonth == todayMonth &&
          expiredDate < todayDate
        )
      ) {
        answer.add(idx);
      }
      idx++;
    }

    return answer.stream().mapToInt(x -> x).toArray();
  }
}
