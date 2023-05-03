package com.example.javaproject2.CodeUp;

import java.util.Scanner;

public class CodeUp1091 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();
        int n = sc.nextInt();

        long answer = a;
        for (int i = 1; i < n; i++) {
            answer = (answer * m) + d;
        }
        System.out.println(answer);
    }
}
