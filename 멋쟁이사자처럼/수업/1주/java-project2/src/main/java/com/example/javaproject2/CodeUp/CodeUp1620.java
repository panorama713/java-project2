package com.example.javaproject2.CodeUp;

import java.util.Scanner;

public class CodeUp1620 {
    public static int sum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while (true) {
            num = sum(num);
            if (num / 10 == 0) {
                System.out.println(num);
                break;
            } else {
                sum(num);
            }
        }
    }
}
