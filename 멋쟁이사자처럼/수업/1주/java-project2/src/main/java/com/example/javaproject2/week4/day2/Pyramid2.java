package com.example.javaproject2.week4.day2;

public class Pyramid2 {
    private String spaceChar = "0";

    public Pyramid2(String spaceChar) {
        this.spaceChar = spaceChar;
    }

    public void printPyramid(int height) {
        for (int i = height; i > 0; i--) {
            System.out.printf("%s%s\n", spaceChar.repeat(height - i), "*".repeat(2 * i - 1));
        }
    }

    public static void main(String[] args) {
        Pyramid2 pyramid2 = new Pyramid2(" ");
        pyramid2.printPyramid(5);
        pyramid2.printPyramid(4);
    }
}
