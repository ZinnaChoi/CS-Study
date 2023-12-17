package com.example.prac.Lv1;

public class RecommendNewID {
    public String solution(String new_id) {
        
        String newId = new_id.toLowerCase().replaceAll("[^0-9a-z-_.]","").replaceAll("\\.+", ".").replaceAll("^\\.|\\.$", "");;
        
        if (newId.equals("")) newId = "a";

        
        if (newId.length() >= 16){
            newId = newId.charAt(14) == '.' ? newId.substring(0,14) : newId.substring(0,15);
        }
        
        if (newId.length() <= 2){
            newId += String.valueOf(newId.charAt(newId.length()-1)).repeat(3-newId.length());
        }

        return newId;
    }
}
