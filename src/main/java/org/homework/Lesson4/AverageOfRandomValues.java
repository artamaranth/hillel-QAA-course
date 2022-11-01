package org.homework.Lesson4;

import java.util.Arrays;
import java.util.Random;

public class AverageOfRandomValues {
    public static void main(String[] args) {
        int length = 20;
        Random random = new Random();
        int[] randomArray = new int[length];
        double sum = 0;
        for (int n = 0; n < randomArray.length; n++) {
            int i = random.nextInt(100);
            randomArray[n] = i;
            sum = sum + randomArray[n];
        }
        System.out.println(Arrays.toString(randomArray));
        System.out.println(sum / length);
    }
}
