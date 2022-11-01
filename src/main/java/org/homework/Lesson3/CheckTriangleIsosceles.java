package org.homework.Lesson3;

import java.util.Scanner;

public class CheckTriangleIsosceles {
    public static void main(String[] args) {
        String result = "The triangle is not isosceles";
        System.out.println("Please enter the length of the first side:");
        int a = new Scanner(System.in).nextInt();
        System.out.println("Please enter the length of the second side:");
        int b = new Scanner(System.in).nextInt();
        System.out.println("Please enter the length of the third side:");
        int c = new Scanner(System.in).nextInt();
        if (a == b || a == c || b == c) {
            result = "The triangle is isosceles";
        }
        System.out.println(result);
    }
}
