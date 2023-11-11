package com.example.prac.Lv2;
import java.util.*;

public class RemoveInPair {
    public int solution(String s){
        
        Stack<Character> st = new Stack<>();
        
        for (char c : s.toCharArray()){
            if (!st.isEmpty() && st.peek() == c){
                st.pop();
            } else {
                st.push(c);
            }
        }
        
        return st.size() > 0 ? 0 : 1;
    }
}
