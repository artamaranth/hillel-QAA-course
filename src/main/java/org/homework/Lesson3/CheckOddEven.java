package org.homework.Lesson3;

import java.util.Scanner;

public class CheckOddEven {
    public static void main(String[] args) {
        System.out.println("Please enter integer value:");
        int n = new Scanner(System.in).nextInt();
        String checkOddEven = "Odd";
        if (n % 2 == 0) checkOddEven = "Even";
        System.out.println(checkOddEven);
        System.out.println("BYE");
    }
}
