package com.example.prac.Lv1;

import java.util.Stack;

public class DollGrabbingGame {
    public int solution(int[][] board, int[] moves) {
        int popCnt = 0;
        int N = board.length;
        Stack<Integer> basket = new Stack<>();
        for (int move : moves) {
            for (int j = 0; j < N; j++) {
                if (board[j][move - 1] > 0) {
                    if (basket.empty()) {
                        basket.push(board[j][move - 1]);
                    } else {
                        if (basket.peek() == board[j][move - 1]) {
                            basket.pop();
                            popCnt += 2;
                        } else {
                            basket.push(board[j][move - 1]);
                        }
                    }
                    board[j][move - 1] = 0;
                    break;
                }
            }
        }
        return popCnt;
    }
}
