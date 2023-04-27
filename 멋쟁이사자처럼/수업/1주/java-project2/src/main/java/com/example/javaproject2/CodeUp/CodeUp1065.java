package com.example.javaproject2.CodeUp;

import java.util.Scanner;

public class CodeUp1065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            int input = sc.nextInt();
            if (input % 2 == 0){
                System.out.println(input);
            }
        }
    }
}
