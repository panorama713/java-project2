package com.example.javaproject2.week4.day2;

public class MultiplicationTable {
    private String multipleSymbol;

    public MultiplicationTable(String multipleSymbol) {
        this.multipleSymbol = multipleSymbol;
    }

    public void printDan(int dan) {
        for (int i = 1; i < 10; i++) {
            System.out.printf("%d %s %d = %d\n", dan, multipleSymbol, i, dan * i);
        }
        System.out.println("-----");
    }

    public static void main(String[] args) {
        MultiplicationTable mt = new MultiplicationTable("x");
        mt.printDan(2);
    }
}
