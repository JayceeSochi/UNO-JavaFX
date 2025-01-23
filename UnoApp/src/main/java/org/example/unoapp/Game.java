package org.example.unoapp;

import java.util.ArrayList;
import java.util.Random;

public class Game {
    static ArrayList<Card> deck = MakeDeck();
    Card discard;

    private ArrayList<Card> hand = new ArrayList<>();

    private String winner = "";

    private int players;
    private int handSize;

    /////////////////////////////////////////////////////////////
    public static ArrayList<Card> MakeDeck() {
        ArrayList<Card> deckBuild = new ArrayList<>();

        for (int ii = 0; ii < 4; ii++) {

            for (int i = 0; i < 13; i++) {
                Card newCard = new Card();

                Card.Color cardColor;

                switch (ii) {
                    case 1:
                        cardColor = Card.Color.Red;
                        break;
                    case 2:
                        cardColor = Card.Color.Blue;
                        break;
                    case 3:
                        cardColor = Card.Color.Yellow;
                        break;
                    case 4:
                        cardColor = Card.Color.Green;
                        break;
                }

                newCard.setValue(i);

                if (i == 0) {
                    deckBuild.add(newCard);
                } else {
                    deckBuild.add(newCard);
                    deckBuild.add(newCard);
                }
            }
        }

        for (int i = 13; i <= 14; i++) {
            Card newCard = new Card();

            Card.Color cardColor = Card.Color.Black;

            newCard.setValue(i);

            for (int ii = 0; ii < 4; ii++) {
                deckBuild.add(newCard);
            }
        }

        return deckBuild;
    }

    public static void DrawCard() {
        Random rand = new Random();
        Card discard = deck.get(rand.nextInt(deck.size()));
        deck.remove(discard);

        System.out.println("Deck Size: " + deck.size());
        System.out.println("Card: " + discard.toString());
    }

    // playCard(Card)
}
