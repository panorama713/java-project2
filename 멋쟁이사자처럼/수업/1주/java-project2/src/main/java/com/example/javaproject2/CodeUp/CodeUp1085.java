package com.example.javaproject2.CodeUp;

import java.util.Scanner;

public class CodeUp1085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long h = sc.nextInt();
        long b = sc.nextInt();
        long c = sc.nextInt();
        long s = sc.nextInt();

        float result = (float)(h * b * c * s) / 8 / 1024 / 1024;
        System.out.printf("%.01f MB\n", result);
    }
}
