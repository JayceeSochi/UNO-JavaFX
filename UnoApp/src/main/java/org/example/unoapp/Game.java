package org.example.unoapp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Game {
    static ArrayList<Card> deck;
    static Card discard;
    static Player playerTurn;

    static ArrayList<Player> players = new ArrayList<>();

    private static ArrayList<Card> hand = new ArrayList<>();

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

        System.out.println("Total Cards: " + deck.size());
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

                //System.out.println(i + 1 + ") " + card.toString());

                p.getCards().add(card);
            }

            System.out.println(p);
        }

        System.out.println("Remaining Cards: " + deck.size());
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
        } else {
            playerTurn = players.get(0);
        }

        hand = playerTurn.getCards();

        System.out.println("It is " + playerTurn.getName() + "s turn.");
    }

    // Playing the card (unsure if parameter is needed)
    public static void playCard (Card card) {
        // TBA (Valid Logic)
        // If Card is Same Color or Same Symbol or Black Color
        if (card.getValue() == 14) {
            if (playerTurn != players.get(players.size() - 1)) {
                DrawFour(players.get(players.indexOf(playerTurn) + 1));
            } else {
                DrawFour(players.get(0));
            }
        } else if (card.getValue() == 13) {
            // Color Swap Logic
        } else if (card.getValue() == 12) {
            if (playerTurn != players.get(players.size() - 1)) {
                DrawTwo(players.get(players.indexOf(playerTurn) + 1));
            } else {
                DrawTwo(players.get(0));
            }
        } else if (card.getValue() == 11) {
            // Reverse Logic
            Collections.reverse(players);
        } else if (card.getValue() == 10) {
            playerTurn = players.get(players.indexOf(playerTurn) + 1);
        } else {
            // Default Logic
        }

        discard = card;

        // TBA (Invalid Logic

        CyclePlayer();
    }

    // checkUNO()
    public static void checkUNO() {
        for (Player p : players) {
            if (p.getCards().size() == 1 && winner.equals("")) {
                winner = p.getName();
            }

            if (p.getCards().size() > 1 && winner.equals(p.getName())) {
                winner = "";
            }
        }
    }

    // winScreen()
    public static void winScreen() {

    }

    public static void DrawFour(Player player) {
        Random rand = new Random();

        for (int i = 0; i < 4; i++) {
            Card card = deck.get(rand.nextInt(deck.size()));

            deck.remove(card);
            player.getCards().add(card);
        }

        // WIP Prompt Choose Color
    }

    public static void DrawTwo(Player player) {
        Random rand = new Random();

        for (int i = 0; i < 2; i++) {
            Card card = deck.get(rand.nextInt(deck.size()));

            deck.remove(card);
            player.getCards().add(card);
        }
    }
}
