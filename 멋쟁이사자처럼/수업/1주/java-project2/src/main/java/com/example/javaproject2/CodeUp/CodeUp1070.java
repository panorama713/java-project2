package com.example.javaproject2.CodeUp;

import java.util.Scanner;

public class CodeUp1070 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int season = sc.nextInt();
        String result = "";
        switch (season) {
            case 12 : result = "winter";
                break;
            case 1 : result = "winter";
                break;
            case 2 : result = "winter";
                break;
            case 3 : result = "spring";
                break;
            case 4 : result = "spring";
                break;
            case 5 : result = "spring";
                break;
            case 6 : result = "summer";
                break;
            case 7 : result = "summer";
                break;
            case 8 : result = "summer";
                break;
            case 9 : result = "fall";
                break;
            case 10 : result = "fall";
                break;
            case 11 : result = "fall";
                break;
        }
        System.out.println(result);
    }
}
