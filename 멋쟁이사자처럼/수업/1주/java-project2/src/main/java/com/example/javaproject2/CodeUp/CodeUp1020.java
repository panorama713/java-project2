package com.example.javaproject2.CodeUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUp1020 {
    public static void main(String[] args) throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        String citizenNumber = br.readLine().replace("-", "");
        System.out.println(citizenNumber);
    }
}