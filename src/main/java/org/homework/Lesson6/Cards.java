package org.homework.Lesson6;

import java.util.Arrays;
import java.util.Random;

public class Cards {

    private static final String values = "2,3,4,5,6,7,8,9,10,Jack,Lady,King,Ace";
    private static final String suits = "spades,club,diamond,heart";
    private static final String[] valuesArray = values.split(",");
    private static final String[] suitsArray = suits.split(",");

    public static String[] getNoDuplicatesArray(int players) {
        return dealCards(players);
    }

    private static int i = 0;
    private static int k = 0;

    private static String[] dealCards(int players) {

        String[] noDuplicatesArray = new String[5 * players];
        String[] tempArray = new String[5 * players];
        for (int round = 1; round <= 5; round++) {
            for (int player = 1; player <= players; player++) {

                Random random = new Random();
                int randomValue = random.nextInt(valuesArray.length);
                int randomSuit = random.nextInt(suitsArray.length);
                String card = valuesArray[randomValue] + " " + suitsArray[randomSuit];
                noDuplicatesArray[i] = "Гравець " + player + " отримує карту " + card;

                while (Arrays.asList(tempArray).contains(card)) {
                    randomValue = random.nextInt(valuesArray.length);
                    randomSuit = random.nextInt(suitsArray.length);
                    card = valuesArray[randomValue] + " " + suitsArray[randomSuit];
                    noDuplicatesArray[i] = "Гравець " + player + " отримує карту " + card;
                }
                tempArray[k] = card;
                k++;
                i++;
            }
        }
        for (String str : noDuplicatesArray) {
            System.out.println(str);
        }
        return noDuplicatesArray;
    }
}