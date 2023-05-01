package com.example.javaproject2.week3.day1;

public class ForEx2 {
    public static void main(String[] args) {
//        for (int i = 10; i < 0; i--) {
//            System.out.println(i);
//        }
//        --> 무한루프
        for (int i = 10; i > 0; i--) {
            System.out.printf("%d \n", i);
        }
        System.out.println("----");

        for (int i = 10; i >= 0; i--) {
            System.out.printf("%d \n", i);
        }
        System.out.println();
    }
}
