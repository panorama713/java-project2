package com.example.javaproject2.CodeUp;

import java.util.Scanner;

public class CodeUp1064 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        int result = (num1 > num2 ? num2 : num1) > num3 ? num3 : (num1 > num2 ? num2 : num1);
        System.out.println(result);
    }
}
