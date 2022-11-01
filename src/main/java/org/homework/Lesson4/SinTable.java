package org.homework.Lesson4;

public class SinTable {
    public static void main(String[] args) {

        for (int n = 0; n <= 360; n += 10) {
            System.out.println("Sin(" + n + ")= " + Math.sin(n));

        }
    }
}
