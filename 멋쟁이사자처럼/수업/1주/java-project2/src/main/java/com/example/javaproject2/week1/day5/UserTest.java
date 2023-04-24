package com.example.javaproject2.week1.day5;

public class UserTest {
    public static void main(String[] args) {
        User younggeun = new User();
        younggeun.name = "김영근";
        younggeun.phoneNumber = "010-0000-0000";
        younggeun.age = 31;

        User gildong = new User();
        gildong.name = "홍길동";
        gildong.phoneNumber = "010-0000-0001";
        gildong.age = 23;

        System.out.printf("%s님은 성인입니까? %s\n", younggeun.name, younggeun.isAdult());
        System.out.printf("%s님은 성인입니까? %s\n", gildong.name, gildong.isAdult());
    }
}