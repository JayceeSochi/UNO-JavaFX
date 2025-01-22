package org.example.unoapp;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    public static int numPlayers;

    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        // This is to test that the number of players desired is passed through.
        welcomeText.setText("Player Count: " + numPlayers);
    }
}