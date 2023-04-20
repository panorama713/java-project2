package com.example.javaproject2.week1.day4;

import com.example.javaproject2.PrintHello;

public class VariableEx {
    public static void main(String[] args) {
        int iVal;
        iVal  = 0;
        PrintHello printHello; // 변수 선언
        // printHello.print() << 초기화가 되지 않았기 때문에 사용불가함 -> 인스턴스화 필요
        PrintHello printHello1 = new PrintHello(); // New 를 이용해 인스턴스화 및 초기화
        printHello1.print(); // << 인스턴스화 및 초기화를 하였기 떄문에 사용가능
        System.out.println(iVal);
    }
}
