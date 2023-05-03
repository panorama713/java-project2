package com.example.javaproject2.CodeUp;

import java.util.Scanner;

public class CodeUp1093 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] callName = new int[23];
        for (int i = 0; i < n; i++) {
            callName[sc.nextInt() - 1] += 1;
        }
        for (int call : callName) {
            System.out.printf("%d ", call);
        }
        System.out.println();
    }
}
