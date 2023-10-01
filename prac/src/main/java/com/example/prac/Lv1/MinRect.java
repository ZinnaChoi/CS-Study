package com.example.prac.Lv1;

public class MinRect {

    public int solution(int[][] sizes) {

        int idx = 0;
        int max1 = 0;
        int max2 = 0;
        int[][] orderedSizes = new int[sizes.length][2];

        for (int[] sizeRow : sizes) {
            orderedSizes[idx] = sizeRow[0] > sizeRow[1] ? new int[] { sizeRow[0], sizeRow[1] }
                    : new int[] { sizeRow[1], sizeRow[0] };
            idx += 1;
        }

        for (int[] i : orderedSizes) {
            if (i[0] > max1)
                max1 = i[0];
            if (i[1] > max2)
                max2 = i[1];
        }
        return max1 * max2;
    }

}
