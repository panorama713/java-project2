package com.example.javaproject2.week2.day3;

import java.util.Arrays;

/**
 * packageName : com.example.javaproject2.week2.day3
 * fileName : SwapEx
 * author : gim-yeong-geun
 * date : 2023/04/26
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023/04/26         gim-yeong-geun          최초 생성
 */
public class SwapEx {
    public static void main(String[] args) {
        int[] arr = {2, 1, 4, 8, 7, 6};

        int tmp = arr[0];
        arr[0] = arr[1];
        arr[1] = tmp;

        System.out.println(Arrays.toString(arr));
    }
}
