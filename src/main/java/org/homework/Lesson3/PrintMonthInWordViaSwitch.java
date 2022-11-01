package org.homework.Lesson3;

import java.util.Scanner;

public class PrintMonthInWordViaSwitch {
    public static void main(String[] args) {
        String month = "Not a valid month";
        System.out.println("Please enter month serial number:");
        int m = new Scanner(System.in).nextInt();

        switch (m) {
            case 1 -> month = "JAN";
            case 2 -> month = "FEB";
            case 3 -> month = "MAR";
            case 4 -> month = "APR";
            case 5 -> month = "MAY";
            case 6 -> month = "JUN";
            case 7 -> month = "JUl";
            case 8 -> month = "AUG";
            case 9 -> month = "SEP";
            case 10 -> month = "OCT";
            case 11 -> month = "NOV";
            case 12 -> month = "DEC";
        }
        System.out.println(month);
    }
}
