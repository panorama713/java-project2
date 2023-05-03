package com.example.javaproject2.CodeUp;

import java.util.Scanner;

public class CodeUp1092 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int student1 = sc.nextInt();
        int student2 = sc.nextInt();
        int student3 = sc.nextInt();

        int i = 1;
        while (true) {
            if (i % student1 == 0 && i % student2 == 0 && i % student3 == 0) {
                System.out.println(i);
                break;
            }
            i++;
        }
    }
}
