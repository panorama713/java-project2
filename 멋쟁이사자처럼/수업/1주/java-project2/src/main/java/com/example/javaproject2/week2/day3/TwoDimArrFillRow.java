package com.example.javaproject2.week2.day3;

import java.util.Arrays;

public class TwoDimArrFillRow {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];

        arr[2][0] = 1;
        arr[2][1] = 1;
        arr[2][2] = 1;
        arr[2][3] = 1;
        arr[2][4] = 1;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
