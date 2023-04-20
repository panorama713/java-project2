package com.example.javaproject2.CodeUp;

import java.util.ArrayList;
import java.util.Scanner;

public class CodeUp1025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList arr = new ArrayList();
        int num = sc.nextInt();
        while (num > 0) {
            arr.add(num % 10);
            num /= 10;
        }
        for (int i = arr.size() - 1; i >= 0; i--) {
            System.out.printf("[%d]\n", (int) arr.get(i) * (int) Math.pow(10, i));
        }
    }
}
