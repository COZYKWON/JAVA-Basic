package oop1.ex;

public class Rectangle {
    int width;
    int height;

    void insert(int x, int y) {
        width = x;
        height = y;
    }

    void calculateArea() {
        System.out.println("넓이: " + (width * height));
    }

    void calcualtePerimeter() {
        System.out.println("둘레 길이: " + (width + height) * 2);
    }

    void isSquare() {
        boolean square = width == height;
        System.out.println("정사각형 여부: " + square);
    }
}
