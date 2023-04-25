package com.example.javaproject2.CodeUp;

import java.util.Scanner;

public class CodeUp1046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        int addThreeNum = num1 + num2 + num3;
        System.out.println(addThreeNum);
        System.out.printf("%.01f", (float) addThreeNum / 3);
    }
}
