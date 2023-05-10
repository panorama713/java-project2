package com.example.javaproject2.week4.day2;

public class DIEx {
    private ShapeDrawer shapeDrawer;
    private ParallelogramShapeDrawer parallelogramShapeDrawer;

    public DIEx(ShapeDrawer shapeDrawer) {
        this.shapeDrawer = shapeDrawer;
    }

    public DIEx(ParallelogramShapeDrawer parallelogramShapeDrawer) {
        this.parallelogramShapeDrawer = parallelogramShapeDrawer;
    }

    public void doSth() {
        shapeDrawer.printPyramid(5);
    }

    public void doSth2() {
        parallelogramShapeDrawer.printPyramid(4);
    }
}
