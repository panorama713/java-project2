package com.example.javaproject2.CodeUp;

import java.util.Scanner;

public class CodeUp1041 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch = str.charAt(0);
        int ascii = (int) ch;
        char result = (char)(ascii + 1);
        System.out.println(result);
    }
}
