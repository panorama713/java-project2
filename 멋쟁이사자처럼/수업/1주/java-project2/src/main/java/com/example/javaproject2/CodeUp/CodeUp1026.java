package com.example.javaproject2.CodeUp;

import java.util.Scanner;

public class CodeUp1026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String minute = sc.nextLine().split(":")[1];
        if (Integer.parseInt(minute) == 0){
            System.out.println(0);
        }else{
            System.out.printf("%02d", Integer.parseInt(minute));
        }
    }
}
