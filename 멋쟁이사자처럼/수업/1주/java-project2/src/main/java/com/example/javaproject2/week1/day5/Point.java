package com.example.javaproject2.week1.day5;

public class Point {
    int x = 0;
    int y = 0;

    boolean isSameXy(){
        return x == y;
    }

    public static void main(String[] args) {
        Point p1 = new Point();
        System.out.printf("x: %d, y: %d", p1.x, p1.y);
        System.out.printf("xy가 같은지? %s\n", p1.isSameXy());

        Point p2 = new Point();
        p2.x = 1;
        p2.y = 1;
        System.out.printf("x: %d, y: %d", p2.x, p2.y);
        System.out.printf("xy가 같은지? %s\n", p2.isSameXy());

        Point p3 = new Point();
        p3.x = 2;
        p3.y = 3;
        System.out.printf("x: %d, y: %d", p3.x, p3.y);
        System.out.printf("xy가 같은지? %s\n", p3.isSameXy());
    }
}