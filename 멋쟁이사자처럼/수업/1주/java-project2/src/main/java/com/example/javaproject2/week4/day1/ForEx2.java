package com.example.javaproject2.week4.day1;

public class ForEx2 {
    public static void main(String[] args) {
        // 직각삼각형
        int num = 4;
        // 왼쪽정렬
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < i; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }
        // 오른쪽 정렬
        for (int i = 0; i < num; i++) {
            for (int j = num - 1; j > i; j--) {
                System.out.printf(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
