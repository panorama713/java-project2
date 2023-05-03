package com.example.javaproject2.CodeUp;

import java.util.Scanner;

public class CodeUp1097 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] badook = new int[19][19];
        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                badook[i][j] = sc.nextInt();
            }
        }
        int reverseCnt = sc.nextInt();
        for (int i = 0; i < reverseCnt; i++) {
            int p1 = sc.nextInt() - 1;
            int p2 = sc.nextInt() - 1;
            for (int j = 0; j < 19; j++) {
                if (badook[p1][j] == 1) {
                    badook[p1][j] = 0;
                } else {
                    badook[p1][j] = 1;
                }
                if (badook[j][p2] == 1) {
                    badook[j][p2] = 0;
                } else {
                    badook[j][p2] = 1;
                }
            }
        }
        // 출력
        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                System.out.printf("%d ", badook[i][j]);
            }
            System.out.println();
        }
    }
}
