package com.example.prac.Lv2;

public class MagicElevator {
    public int solution(int storey) {
        int stones = 0;
        int up = 0;

        while (storey > 0 || up > 0) {
            int currentDigit = (storey % 10) + up;
            up = 0;
            if (currentDigit <= 4) {
                stones += currentDigit;
            } else if (currentDigit >= 6) {
                stones += (10 - currentDigit);
                up = 1;
            } else {
                if ((storey / 10) % 10 <= 4) {
                    stones += currentDigit;
                } else {
                    stones += (10 - currentDigit);
                    up = 1;
                }
            }
            storey /= 10;
        }
        return stones;
    }

}
