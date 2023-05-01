package com.example.javaproject2.week3.day1;

public class MultiplicationTable {

    public static void printDan(int dan) {
        for (int i = 1; i <= 9 ; i++) {
            System.out.printf("%d * %d = %d\n", dan, i, i * dan);
        }
        System.out.println("--------");
    }

    public static void main(String[] args) {
        int[] dan = {2, 4, 8, 9};
        for (int i = 0; i < dan.length; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.printf("%d * %d = %d\n", dan[i], j, j * dan[i]);
            }
            System.out.println("-----");
        }
        System.out.println("메소드를 이용한 구구단");
        printDan(2);
        printDan(4);
        printDan(8);
        printDan(9);
    }
}
