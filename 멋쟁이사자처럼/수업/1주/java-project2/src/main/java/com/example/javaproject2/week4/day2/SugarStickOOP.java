package com.example.javaproject2.week4.day2;

import java.util.Arrays;

public class SugarStickOOP {
    private int[][] arr;
    private boolean printSeparator;

    public SugarStickOOP(int rowCnt, int colCnt) {
        this.arr = new int[rowCnt][colCnt];
    }

    public SugarStickOOP(boolean printSeparator) {
        this.arr = new int[5][5];
        this.printSeparator = printSeparator;
    }

    public SugarStickOOP(int rowCnt) {
        this.arr = new int[rowCnt][5];
    }

    public void setBeam(int l, int d, int x, int y) {
        if (d == 0) { // 가로
            for (int i = 0; i < l; i++) {
                arr[y - 1][x - 1 + i] = 1;
            }
        } else { // 세로
            for (int i = 0; i < l; i++) {
                arr[y - 1 + i][x - 1] = 1;
            }
        }
    }

    public void printArr() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.println("----");
    }

    public static void main(String[] args) {
        int rowCnt = 7;
        int colCnt = 7;
        SugarStickOOP sugarStickOOP = new SugarStickOOP(rowCnt, colCnt);
        sugarStickOOP.setBeam(2,0,1,1);
        sugarStickOOP.printArr();

        SugarStickOOP sugarStickOOP2 = new SugarStickOOP(false);
        sugarStickOOP2.setBeam(2,0,1,1);
        sugarStickOOP2.printArr();
    }
}
