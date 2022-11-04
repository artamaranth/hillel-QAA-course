package org.homework.Lesson3;

import java.util.Scanner;

public class CompareAbsoluteValues {
    public static void main(String[] args) {

        String result;
        System.out.println("Please enter first value:");
        int first = new Scanner(System.in).nextInt();
        System.out.println("Please enter second value:");
        int second = new Scanner(System.in).nextInt();
        if (Math.abs(first) > Math.abs(second)) {
            result = "The first value is bigger than the second";
        } else if (Math.abs(first) < Math.abs(second)) {
            result = "The second value is bigger than the first";
        } else {
            result = "Absolute values are equal";
        }
        System.out.println(result);
    }
}