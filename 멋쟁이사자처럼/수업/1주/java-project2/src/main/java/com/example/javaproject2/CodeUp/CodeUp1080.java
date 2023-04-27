package com.example.javaproject2.CodeUp;

import java.util.Scanner;

public class CodeUp1080 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int targetNum = sc.nextInt();
        int addNum = 0;
        int i = 0;
        while (targetNum > addNum) {
            i++;
            addNum += i;
        }
        System.out.println(i);
    }
}
