package com.example.javaproject2.CodeUp;

import java.util.Scanner;

public class CodeUp1069 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String score = sc.nextLine();
        if (score.equals("A")) {
            System.out.println("best!!!");
        } else if (score.equals("B")) {
            System.out.println("good!!");
        } else if (score.equals("C")) {
            System.out.println("run!");
        } else if (score.equals("D")) {
            System.out.println("slowly~");
        } else {
            System.out.println("what?");
        }
    }
}
