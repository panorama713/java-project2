package com.example.javaproject2.CodeUp;

import java.io.IOException;
import java.util.Scanner;

public class CodeUp1019 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String cal = sc.nextLine();
        int year = Integer.parseInt(cal.split("\\.")[0]);
        int month = Integer.parseInt(cal.split("\\.")[1]);
        int day = Integer.parseInt(cal.split("\\.")[2]);
        System.out.printf("%04d.%02d.%02d\n", year, month, day);
    }
}