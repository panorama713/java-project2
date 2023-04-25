package com.example.javaproject2.week2.day1;

public class NumberFormatException {
    public static void main(String[] args) {
        String str = "123ab";
        int num = Integer.parseInt(str); // 컴파일 과정에서 오류가 남

        System.out.println(num);
    }
}
