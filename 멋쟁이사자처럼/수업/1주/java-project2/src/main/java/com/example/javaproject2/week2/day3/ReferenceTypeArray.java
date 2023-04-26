package com.example.javaproject2.week2.day3;

public class ReferenceTypeArray {
    public static void main(String[] args) {
        Student[] students = new Student[2];
        students[0] = new Student(); // Student 클래스의 초기화
        students[0].name = "홍길동"; // Student 클래스 초기화 후 가능
        students[0].phoneNumber = "010-1234-5678";
        students[0].age = 30;
        students[1] = new Student();
        students[1].name = "이순신";
        students[1].phoneNumber = "010-1234-6789";
        students[1].age = 32;
    }
}
