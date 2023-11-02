package com.example.prac.Lv1;

import java.util.*;

public class MakeHamburger {
    public int solution(int[] ingredient) {
        int burgerCnt = 0;
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < ingredient.length; i++) {
            st.push(ingredient[i]);
            if (st.size() >= 4) {
                if (st.get(st.size() - 4) == 1 &&
                        st.get(st.size() - 3) == 2 &&
                        st.get(st.size() - 2) == 3 &&
                        st.get(st.size() - 1) == 1) {
                    burgerCnt++;
                    st.pop();
                    st.pop();
                    st.pop();
                    st.pop();
                }
            }
        }

        return burgerCnt;
    }
}
