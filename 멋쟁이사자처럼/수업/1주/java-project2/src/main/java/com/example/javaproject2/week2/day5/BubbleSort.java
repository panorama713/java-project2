package com.example.javaproject2.week2.day5;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {2, 1, 7, 9, 5, 4, 3};

        while (true) {
            // 정렬 실행 순회
            int check = 0;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i+ 1] = tmp;
                } else {
                    check++;
                }
            }
            if (check == arr.length - 1) {
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
