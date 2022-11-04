package org.homework.Lesson4;

import java.util.Random;

public class Poker {
    public static void main(String[] args) {
        String values = "2,3,4,5,6,7,8,9,10,Jack,Lady,King,Ace";
        String suits = "spades,club,diamond,heart";
        String[] valuesArray = values.split(",");
        String[] suitsArray = suits.split(",");
        for (int round = 1; round <= 5; round++) {
            for (int player = 1; player <= 4; player++) {
                Random random = new Random();

                int randomValue = random.nextInt(valuesArray.length);
                int randomSuit = random.nextInt(suitsArray.length);

                System.out.println("Гравець " + player + " отримує карту " + valuesArray[randomValue] +" "+ suitsArray[randomSuit]);
            }
        }
    }
}
