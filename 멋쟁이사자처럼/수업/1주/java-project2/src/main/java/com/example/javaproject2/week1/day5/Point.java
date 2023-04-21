package com.example.javaproject2.week1.day5;

public class Point {
    int x = 0;
    int y = 0;

    boolean isSameXy(){
        return x == y;
    }

    // 도전과제 : 두 점 사이의 거리를 구하는 함수
    double getDistance(Point p2) {
        int xL = p2.x - this.x;
        int yL = p2.y - this.y;

        double sumOfPow = Math.pow(xL, 2) + Math.pow(yL, 2);
        double result = Math.sqrt(sumOfPow);

        return result;
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