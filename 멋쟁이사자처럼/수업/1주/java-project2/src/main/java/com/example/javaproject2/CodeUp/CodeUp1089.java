package com.example.javaproject2.CodeUp;

import java.util.Scanner;

public class CodeUp1089 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int d = sc.nextInt();
        int n = sc.nextInt();

        int answer = a;
        for (int i = 0; i < n - 1; i++) {
            answer += d;
        }
        System.out.println(answer);
    }
}
