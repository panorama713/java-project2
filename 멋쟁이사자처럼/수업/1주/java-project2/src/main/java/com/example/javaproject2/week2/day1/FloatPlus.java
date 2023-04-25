package com.example.javaproject2.week2.day1;

public class FloatPlus {
    public static void main(String[] args) {
        String val1 = "1.11111111";
        String val2 = "2.11111111";
        float result = Float.valueOf(val1) + Float.valueOf(val2);
        System.out.println(result);

        double result2 = Double.parseDouble(val1) + Double.parseDouble(val2);
        System.out.println(result2);
    }
}
