package com.example.javaproject2.CodeUp;

import java.util.Scanner;

public class CodeUp1099 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int i = 1;
        int j = 1;
        while (i < 9 && j < 9) {
            if (arr[i][j] == 2) {
                arr[i][j] = 9;
                break;
            } else {
                arr[i][j] = 9;
            }
            if (arr[i][j + 1] == 0 || arr[i][j + 1] == 2) {
                j++;
            } else {
                i++;
            }


        }
        for (int[] items : arr) {
            for (int item : items) {
                System.out.printf("%d ", item);
            }
            System.out.println();
        }
    }
}
