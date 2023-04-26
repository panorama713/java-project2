package com.example.javaproject2.week2.day3;

import java.util.Arrays;

/**
 * packageName : com.example.javaproject2.week2.day3
 * fileName : TwoDimArrEx
 * author : gim-yeong-geun
 * date : 2023/04/26
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023/04/26         gim-yeong-geun          최초 생성
 */
public class TwoDimArrEx {
    public static void printArray(int[][] arr) {
        System.out.println(Arrays.toString(arr[0]));
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr[2]));
        System.out.println("----------");
    }
    // 행 번호를 넣으면 그 행을 1로 값을 넣어주는 static method
    public static void inputOneForRow(int[][] arr, int i){
        for (int j = 0; j < arr.length ; j++) {
            arr[i][j] = 1;
        }
        for (int j = 0; j < arr.length; j++) {
            System.out.println(Arrays.toString(arr[j]));
        }
        System.out.println("------");
    }

    // 열 번호를 넣으면 그 열에 1의 값을 넣어주는 static method
    public static void inputOneForCol(int[][] arr, int i){
        for (int j = 0; j < arr.length ; j++) {
            arr[j][i] = 1;
        }
        for (int j = 0; j < arr.length; j++) {
            System.out.println(Arrays.toString(arr[j]));
        }
        System.out.println("------");
    }

    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        printArray(arr);

        arr[0][0] = 1;
        arr[0][2] = 2;
        arr[1][0] = 3;
        printArray(arr);

        arr[1][1] = 5;
        printArray(arr);

        int[][] inputOneForRow = new int[5][5];
        inputOneForRow(inputOneForRow, 3);
        int[][] inputOneForCol = new int[5][5];
        inputOneForCol(inputOneForCol, 3);
    }
}
