package com.example.javaproject2.CodeUp;

import java.util.Scanner;

public class CodeUp1082 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dice1 = sc.nextInt(16);
        for (int j = 1; j < 16; j++) {
            System.out.printf("%X*%X=%X\n", dice1, j, dice1 * j);
        }
    }
}
