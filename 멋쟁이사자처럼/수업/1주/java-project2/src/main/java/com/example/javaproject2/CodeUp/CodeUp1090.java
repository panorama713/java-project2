package com.example.javaproject2.CodeUp;

import java.util.Scanner;

public class CodeUp1090 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int r = sc.nextInt();
        int n = sc.nextInt();

        int answer = a;
        for (int i = 1; i < n; i++) {
            answer *= r;
        }
        System.out.println(answer);
    }
}
