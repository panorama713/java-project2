package com.example.javaproject2.CodeUp;

import java.util.Scanner;

public class CodeUp1274 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in  );
        int num = sc.nextInt();
        int cnt = 0;
        for (int i = 2 ; i * i <= num; i++) {
            if (num % i == 0) {
                cnt++;
                break;
            }
        }
        System.out.println(cnt > 0 ? "not prime" : "prime");
    }
}
