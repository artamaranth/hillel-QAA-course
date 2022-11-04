package org.homework.Lesson4;

import java.util.Arrays;
import java.util.Random;

public class RandomEvenToZero {
    public static void main(String[] args) {
        Random random = new Random();
        int[] oddArray = new int[10];
        for (int n = 0; n < oddArray.length; n++) {
            int i = random.nextInt(100);
            oddArray[n] = i;
        }
        System.out.println(Arrays.toString(oddArray));
        for (int n = 0; n < oddArray.length; n++) {
            if (oddArray[n] % 2 == 0) oddArray[n] = 0;
        }
        System.out.println(Arrays.toString(oddArray));
    }
}
