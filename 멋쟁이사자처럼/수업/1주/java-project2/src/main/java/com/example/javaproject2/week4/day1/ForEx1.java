package com.example.javaproject2.week4.day1;

import java.util.Scanner;

public class ForEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            for (int j = num - 1; j > i; j--) {
                System.out.printf(" ");
            }
            for (int j = 0; j < (2 * i) + 1; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
