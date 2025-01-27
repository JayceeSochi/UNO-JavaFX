package org.example.unoapp;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public class GameController {
    @FXML
    private HBox PlayerDeck;

    @FXML
    private ImageView card;

    @FXML
    private Label currentPlayerTurn;

    @FXML
    private ImageView discardPile;

    @FXML
    private ImageView drawPile;

    @FXML
    private Label invalidMoveMessage;

    @FXML
    private Label playerCardAmount;

    @FXML
    private Pane playerCardNumInfo;

    @FXML
    private Label playerNumber;

    @FXML
    private VBox playersCardsNumDisplay;

    @FXML
    void DrawCard(MouseEvent event) {

    }

    @FXML
    void PlayCard(MouseEvent event) {

    }
}
