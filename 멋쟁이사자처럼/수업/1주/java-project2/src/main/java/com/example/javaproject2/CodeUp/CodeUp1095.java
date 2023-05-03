package com.example.javaproject2.CodeUp;

import java.util.Scanner;

public class CodeUp1095 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min = 10001;
        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();
            if (num < min) {
                min = num;
            }
        }
        System.out.println(min);
    }
}
