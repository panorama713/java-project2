package com.example.javaproject2.week2.day2;

import java.util.Arrays;

public class DefAndInitArr {
    public static void main(String[] args) {
        int[] iArr = new int[5];
        System.out.println(iArr.hashCode());

        System.out.println(iArr[0]);
        System.out.println(iArr[1]);
        System.out.println(iArr[2]);

        System.out.println(Arrays.toString(iArr));

        iArr[0] = 2;
        iArr[1] = 4;
        iArr[2] = 7;

        System.out.println(Arrays.toString(iArr));
    }
}
