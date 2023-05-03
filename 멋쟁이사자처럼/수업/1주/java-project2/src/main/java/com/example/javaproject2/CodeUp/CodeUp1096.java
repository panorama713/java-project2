package com.example.javaproject2.CodeUp;

import java.util.Scanner;

public class CodeUp1096 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        // 바둑판 초기화
        int[][] badook = new int[19][19];
        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                badook[i][j] = 0;
            }
        }
        // 바둑판의 흰돌을 놓는 로직
        for (int i = 0; i < cnt; i++) {
            badook[sc.nextInt() - 1][sc.nextInt() - 1] = 1;
        }

        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                System.out.printf("%d ", badook[i][j]);
            }
            System.out.println();
        }
    }
}
