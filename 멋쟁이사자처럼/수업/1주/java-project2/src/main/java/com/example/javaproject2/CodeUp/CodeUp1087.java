package com.example.javaproject2.CodeUp;

import java.util.Scanner;

public class CodeUp1087 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = 0;
        int i = 0;
        while (result < num) {
            i++;
            result += i;
        }
        System.out.println(result);
    }
}
