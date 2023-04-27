package com.example.javaproject2.CodeUp;

import java.util.Scanner;

public class CodeUp1083 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 1; i < num + 1; i++) {
            if (i == 3 || i == 6 || i == 9) {
                System.out.printf("X ");
            } else {
                System.out.printf("%d ", i);
            }
        }
        System.out.println();
    }
}
