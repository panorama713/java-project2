package com.example.javaproject2.week4.day2;

public class Pyramid {
    private String spaceChar = "0";

    public Pyramid(String spaceChar) {
        this.spaceChar = spaceChar;
    }

    public void printPyramid(int height)    {
        for (int i = 0; i < height; i++) {
            System.out.printf("%s%s\n", spaceChar.repeat(height - i - 1), "*".repeat(2 * i + 1));
        }
    }

    public static void main(String[] args) {
        Pyramid pyramid = new Pyramid(" ");
        Pyramid pyramidSpaceZero = new Pyramid("0");

        pyramid.printPyramid(4);
        pyramidSpaceZero.printPyramid(5);
    }
}
