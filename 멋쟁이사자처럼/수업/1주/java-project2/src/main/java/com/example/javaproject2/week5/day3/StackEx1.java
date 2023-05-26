package com.example.javaproject2.week5.day3;

import java.util.Arrays;
import java.util.EmptyStackException;

public class StackEx1 {
    private int[] arr = new int[10000];
    private int pointer = 0;

    public void push(int val) {
        this.arr[pointer++] = val;
//        System.out.println(Arrays.toString(arr));
//        System.out.println("pointer = " + pointer);
    }

    public boolean isEmpty() {
        return this.pointer == 0;
    }

    // pointer 를 줄이는 방법 -> 직관적
    public int pop() {
        if (isEmpty()) throw new EmptyStackException();
        return this.arr[--pointer];
    }

    public int peek() {
        if (isEmpty()) throw new RuntimeException("스택이 비었습니다.");
        return this.arr[pointer - 1];
    }

    public static void main(String[] args) {
        StackEx1 st1 = new StackEx1();
        System.out.println(st1.isEmpty());
        st1.push(10);
        System.out.println(st1.isEmpty());
        st1.push(20);
        System.out.println(st1.peek());
        System.out.println(st1.pop());
        System.out.println(st1.pop());
        System.out.println(st1.pop());
        System.out.println(st1.peek());
    }
}
