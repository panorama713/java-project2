package com.example.javaproject2.week4.day3;

public abstract class ShapeDrawer2 {
    public abstract String makeALine(int h, int i);

    public void printShape(int height) {
        for (int i = 1; i <= height; i++) {
            System.out.printf("%s", makeALine(height, i));
        }
    }
}
