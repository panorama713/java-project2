package com.example.javaproject2.week4.day1;

import java.util.Scanner;

public class ForEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 1; i < num + 1; i++) {
            for (int j = num; j > i; j--) {
                System.out.printf(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.printf("*");
            }
            for (int j = 1; j < i; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
