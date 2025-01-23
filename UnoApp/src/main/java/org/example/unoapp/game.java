/**
 * @author ggarcia
 * @createdOn 1/23/2025 at 3:06 PM
 * @projectName UnoApp
 * @packageName org.example.unoapp;
 */
package org.example.unoapp;

public class game {
    card[] deck = new card[108];
    card[] discardPile = new card[108];
    card[] hand = new card[108];

    private card[] makeDeck() {
        int c = 0;
        colors color = null;
        int value = 0;
        for (int i = 0; i <= 4; i++) {
            value = 0;
            if (i == 1) {
                color = colors.red;
            }
            if (i == 2) {
                color = colors.blue;

                c=25;
            }
            if (i == 3) {
                color = colors.green;
                c=50;
            }
            if (i == 4) {
                color = colors.yellow;
                c=75;
            }
            for (int j = 0; j <= 25; j++) {
                if (value == 13) {
                    value = 1;
                }
                card card = new card(value, color);
                deck[j+c] = card;
                value++;
            }
        }
        color = colors.black;
        c = 100;
        value = 13;
        for (int i = 0; i <= 4; i++) {
            card card = new card(value, color);
            deck[i+c] = card;
        }
        c = 104;
        value = 14;
        for (int i = 0; i <= 4; i++) {
            card card = new card(value, color);
            deck[i+c] = card;
        }
        return deck;
    }
}
