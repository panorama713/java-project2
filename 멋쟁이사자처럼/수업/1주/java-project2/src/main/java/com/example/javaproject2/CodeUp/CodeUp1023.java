package com.example.javaproject2.CodeUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUp1023 {
    public static void main(String[] args) throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        String f = br.readLine();
        System.out.println(f.split("\\.")[0]);
        System.out.println(f.split("\\.")[1]);
    }
}
