package com.example.prac.Lv1;

public class CheckPersonality {
    public String solution(String[] survey, int[] choices) {
        
        String answer = "";
        String[] typeList = {"RT", "CF", "JM", "AN"};
        
        for (String t : typeList){
            int temp = 0;
            for (int i = 0; i < survey.length; i++){
                if (survey[i].equals(t)){
                    temp -= choices[i] - 4;
                } else if (survey[i].equals(String.valueOf(t.charAt(1)) + String.valueOf(t.charAt(0)))){
                    temp += choices[i] - 4;
                }
            }
            answer += temp < 0 ? String.valueOf(t.charAt(1)) : String.valueOf(t.charAt(0)) ;
        }
        return answer;
    }
}
