package com.example.javaproject2.week6.ex1;

public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return radius * radius * Math.PI;
    }

    public void print(){
        System.out.println(calculateArea());
    }
}
