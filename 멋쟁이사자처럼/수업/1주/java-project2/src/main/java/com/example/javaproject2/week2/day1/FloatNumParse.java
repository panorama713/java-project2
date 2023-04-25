package com.example.javaproject2.week2.day1;

public class FloatNumParse {
    public static void main(String[] args) {
        String s1 = "1.5";
        String s2 = "2.5";

        System.out.println(s1 + s2);
        System.out.println(Float.valueOf(s1) + Float.valueOf(s2));
    }
}
