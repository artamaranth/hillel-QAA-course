package org.homework.Lesson2;

public class Temperature {
    public static void main(String[] args) {
        float celsius = 12.34f;
        float kelvin = celsius + 273.16f;
        float farenheit = celsius * 9 / 5 + 32;
        System.out.println(celsius + " C" + ", " + kelvin + " K" + ", " + farenheit + " F");
    }
}
