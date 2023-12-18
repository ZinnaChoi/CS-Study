package com.example.prac.Lv2;

import java.util.*;

public class CalculateParkingFee {

  public int[] solution(int[] fees, String[] records) {
    Map<String, String> timeStampPerCar = new HashMap<>();
    Map<String, Integer> timePerCar = new TreeMap<>();

    for (String record : records) {
      String[] parts = record.split(" ");
      String time = parts[0];
      String carNum = parts[1];
      String inOut = parts[2];
      if (inOut.equals("IN")) {
        timeStampPerCar.put(carNum, time);
      } else if (inOut.equals("OUT")) {
        timePerCar.put(
          carNum,
          timePerCar.getOrDefault(carNum, 0) +
          calculateTimeDiff(time, timeStampPerCar.get(carNum))
        );
        timeStampPerCar.remove(carNum);
      }
    }

    for (Map.Entry<String, String> entry : timeStampPerCar.entrySet()) {
      timePerCar.put(
        entry.getKey(),
        timePerCar.getOrDefault(entry.getKey(), 0) +
        calculateTimeDiff("23:59", entry.getValue())
      );
    }

    int[] answer = new int[timePerCar.size()];
    int idx = 0;
    for (Map.Entry<String, Integer> entry : timePerCar.entrySet()) {
      int parkingTime = entry.getValue();
      answer[idx++] =
        (parkingTime < fees[0])
          ? fees[1]
          : fees[1] +
          (int) Math.ceil((parkingTime - fees[0]) / (double) fees[2]) *
          fees[3];
    }

    return answer;
  }

  public int calculateTimeDiff(String outTime, String inTime) {
    String[] outParts = outTime.split(":");
    String[] inParts = inTime.split(":");

    int outHour = Integer.parseInt(outParts[0]);
    int outMinute = Integer.parseInt(outParts[1]);
    int inHour = Integer.parseInt(inParts[0]);
    int inMinute = Integer.parseInt(inParts[1]);

    return (outHour - inHour) * 60 + outMinute - inMinute;
  }
}
