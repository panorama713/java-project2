package com.example.javaproject2.CodeUp;

import java.util.Scanner;

public class CodeUp1120 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iVal1 = sc.nextInt();
        int iVal2 = sc.nextInt();
        int iVal3 = sc.nextInt();

        System.out.printf("%.02f\n", (float)(iVal1 + iVal2 + iVal3) / 3);
    }
}
