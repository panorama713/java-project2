package com.example.javaproject2.CodeUp;

import java.util.Scanner;

public class CodeUp1076 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        int iVal = (int) ch;
        for (int i = 97; i < iVal + 1; i++) {
            System.out.printf("%c\n", i);
        }
    }
}
