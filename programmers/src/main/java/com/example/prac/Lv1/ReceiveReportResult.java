package com.example.prac.Lv1;

import java.util.*;

public class ReceiveReportResult {

  public int[] solution(String[] id_list, String[] report, int k) {
    Map<String, Set<String>> reportMap = new HashMap<>();
    Map<String, Integer> reportedMap = new HashMap<>();

    for (String r : report) {
      String[] parts = r.split(" ");
      String reporter = parts[0];
      String reportee = parts[1];

      if (!reportMap.containsKey(reporter)) {
        reportMap.put(reporter, new HashSet<>());
      }

      if (!reportMap.get(reporter).contains(reportee)) {
        reportedMap.put(reportee, reportedMap.getOrDefault(reportee, 0) + 1);
        reportMap.get(reporter).add(reportee);
      }
    }

    List<String> suspendedList = new ArrayList<>();
    for (Map.Entry<String, Integer> entry : reportedMap.entrySet()) {
      if (entry.getValue() >= k) {
        suspendedList.add(entry.getKey());
      }
    }

    int[] answer = new int[id_list.length];

    for (int j = 0; j < id_list.length; j++) {
      String userId = id_list[j];
      if (reportMap.containsKey(userId)) {
        int cnt = 0;
        for (String suspendedUser : suspendedList) {
          if (reportMap.get(userId).contains(suspendedUser)) {
            cnt++;
          }
        }
        answer[j] = cnt;
      } else {
        answer[j] = 0;
      }
    }

    return answer;
  }
}
