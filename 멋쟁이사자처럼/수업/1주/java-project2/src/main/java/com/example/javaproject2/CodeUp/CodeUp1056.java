package com.example.javaproject2.CodeUp;

import java.util.Scanner;

public class CodeUp1056 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if (num1 == 1 && num2 == 0 || num1 == 0 && num2 == 1) {
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}
