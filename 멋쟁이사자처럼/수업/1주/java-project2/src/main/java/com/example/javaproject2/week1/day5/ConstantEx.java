package com.example.javaproject2.week1.day5;

public class ConstantEx {
    public final int MAX_LEVEL = 3;
    public static final int MIN_LEVEL = 1;

    public static void main(String[] args) {
        final int iVal;
        iVal = 1;
        System.out.println(iVal);
//        iVal = 2; // 한번 선언된 상수는 변경할수 없다
        System.out.println(iVal);
    }
}
