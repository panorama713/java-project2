package com.example.javaproject2.CodeUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUp1027 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String date = br.readLine();
        String year = date.split("\\.")[0];
        String month = date.split("\\.")[1];
        String day = date.split("\\.")[2];
        System.out.printf("%s-%s-%s", day, month, year);
    }
}