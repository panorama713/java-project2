package com.example.javaproject2.week2.day5;

import java.util.Scanner;

public class IfWithLogicalOperatorEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int yearCount = sc.nextInt();
        int projectCount = sc.nextInt();

        if (yearCount > 5 || projectCount > 10) {
            System.out.println("팀장 승진 대상입니다.");
        } else {
            System.out.println("팀장 승진 대상이 아닙니다.");
        }
    }
}
