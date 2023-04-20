package com.example.javaproject2.week1.day4;

public class FormatPrint {
    public void print(){
        System.out.printf("%04d-%02d-%02d", 2023, 4, 20);
    }
    public static void main(String[] args) {
        FormatPrint formatPrint = new FormatPrint();
        formatPrint.print();
    }
}
