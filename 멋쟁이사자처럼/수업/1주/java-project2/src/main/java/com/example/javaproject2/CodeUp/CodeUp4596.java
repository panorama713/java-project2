package com.example.javaproject2.CodeUp;

import java.util.Scanner;

public class CodeUp4596 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int maxValue = 0;
        int x = 0;
        int y = 0;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (arr[i][j] > maxValue) {
                    maxValue = arr[i][j];
                    x = i;
                    y = j;
                }
            }
        }
        System.out.println(maxValue);
        System.out.printf("%d %d\n", x + 1, y + 1);
    }
}
