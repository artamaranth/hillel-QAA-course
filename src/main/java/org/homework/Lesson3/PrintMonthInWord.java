package org.homework.Lesson3;

import java.util.Scanner;

public class PrintMonthInWord {
    public static void main(String[] args) {
        String month = "Not a valid month";
        System.out.println("Please enter month serial number:");
        int m = new Scanner(System.in).nextInt();

        if (m == 1) {
            month = "JAN";
        } else if (m == 2) {
            month = "FEB";
        } else if (m == 3) {
            month = "MAR";
        } else if (m == 4) {
            month = "APR";
        } else if (m == 5) {
            month = "MAY";
        } else if (m == 6) {
            month = "JUN";
        } else if (m == 7) {
            month = "JUL";
        } else if (m == 8) {
            month = "AUG";
        } else if (m == 9) {
            month = "SEP";
        } else if (m == 10) {
            month = "OCT";
        } else if (m == 11) {
            month = "NOV";
        } else if (m == 12) {
            month = "DEC";
        }
        System.out.println(month);
    }
}
