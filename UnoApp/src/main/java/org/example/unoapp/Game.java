package org.example.unoapp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Game {
    static ArrayList<Card> deck;
    Card discard;
    static Player playerTurn;

    static ArrayList<Player> players = new ArrayList<>();

    private ArrayList<Card> hand = new ArrayList<>();

    private static String winner = "";

    static boolean gameEnd = false;

    static private int playerCount;

    public static int getPlayerCount() {
        return playerCount;
    }

    public static void setPlayerCount(int playerCount) {
        Game.playerCount = playerCount;
    }

    /////////////////////////////////////////////////////////////
    public static void InitializeGame() {
        MakeDeck();
        SetupPlayers();
        DealHands();

        PlayGame();
    }

    public static void PlayGame() {
        CyclePlayer();
    }

    ////////////////////////////////////////////////////////////
    public static void MakeDeck() {
        deck = new ArrayList<>();

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
                    deck.add(newCard);
                } else {
                    deck.add(newCard);
                    deck.add(newCard);
                }
            }
        }

        for (int i = 13; i <= 14; i++) {
            Card newCard = new Card();

            Card.Color cardColor = Card.Color.Black;

            newCard.setValue(i);

            for (int ii = 0; ii < 4; ii++) {
                deck.add(newCard);
            }
        }

        Collections.shuffle(deck);
    }

    public static void SetupPlayers() {
        for (int i = 0; i < playerCount; i++) {
            players.add(new Player("Player" + i));
        }

        playerTurn = players.get(0);
    }

    public static void DealHands() {
        Random rand = new Random();

        for (Player p : players) {
            for (int i = 0; i < 5; i++) {
                Card card = deck.get(rand.nextInt(deck.size()));
                deck.remove(card);

                System.out.println(i + 1 + ") " + card.toString());

                p.getCards().add(card);
            }
        }
    }

    public static void DrawCard() {
        Random rand = new Random();
        Card discard = deck.get(rand.nextInt(deck.size()));
        deck.remove(discard);
        playerTurn.getCards().add(discard);
    }

    public static void CyclePlayer() {
        if (playerTurn != players.get(players.size() - 1)) {
            playerTurn = players.get(players.indexOf(playerTurn) + 1);
        }

        System.out.println("It is " + playerTurn.getName() + "s turn.");
    }

    public static void playCard(Card card) {
        // TBA (Valid Logic)
        if (card.getValue() == 14) {
            // Draw 4 Logic
        } else if (card.getValue() == 13) {
            // Color Swap Logic
        } else if (card.getValue() == 12) {
            // Draw 2 Logic
        } else if (card.getValue() == 11) {
            // Reverse Logic
        } else if (card.getValue() == 10) {
            // Skip Logic
        } else {
            // Default Logic
        }
    }

    // checkUNO()
    public static void checkUNO() {
        for (Player p : players) {
            if (p.getCards().size() == 1 && winner == "") {
                winner = p.getName();
            }
        }
    }

    // winScreen()
    public static void winScreen() {

    }
}
