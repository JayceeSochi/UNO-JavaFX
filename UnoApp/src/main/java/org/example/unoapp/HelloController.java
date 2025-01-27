package org.example.unoapp;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import org.controlsfx.control.tableview2.filter.filtereditor.SouthFilter;

import java.util.ArrayList;

public class HelloController {
    public static int numPlayers = Game.getPlayerCount();

    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        // This is to test that the number of players desired is passed through.
        welcomeText.setText("Player Count: " + numPlayers);

        ArrayList<Card> deck = Game.deck;

//        for (Card card : deck) {
//            System.out.println(card.toString());
//        }

        System.out.println("Deck Size: " + deck.size());

//
//        Game.DrawCard();
    }
}