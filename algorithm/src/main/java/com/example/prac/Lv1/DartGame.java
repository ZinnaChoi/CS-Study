package com.example.prac.Lv1;

import java.util.*;

public class DartGame {
    public int solution(String dartResult) {

        String[] splitNum = dartResult.split("[SDT*#]");
        String[] splitOption = dartResult.split("[0-9]");

        List<Integer> priceArray = new ArrayList<>();
        List<String> optionArray = new ArrayList<>();

        for (int i = 0; i < splitNum.length; i++) {
            if (splitNum[i].length() > 0) {
                priceArray.add(Integer.valueOf(splitNum[i]));
            }
        }
        for (int i = 0; i < splitOption.length; i++) {
            if (splitOption[i].length() > 0) {
                optionArray.add(splitOption[i]);
            }
        }

        int[] priceList = priceArray.stream().mapToInt(x -> x).toArray();
        String[] optionList = optionArray.toArray(new String[optionArray.size()]);

        for (int i = 0; i < optionList.length; i++) {
            if (optionList[i].contains("D")) {
                priceList[i] = (int) Math.pow(priceList[i], 2);
            }
            if (optionList[i].contains("T")) {
                priceList[i] = (int) Math.pow(priceList[i], 3);
            }
            if (optionList[i].contains("#")) {
                priceList[i] = -1 * priceList[i];
            }
            if (optionList[i].contains("*")) {
                priceList[i] = 2 * priceList[i];
                if (i != 0) {
                    priceList[i - 1] = 2 * priceList[i - 1];
                }
            }
        }
        return Arrays.stream(priceList).sum();
    }

}
