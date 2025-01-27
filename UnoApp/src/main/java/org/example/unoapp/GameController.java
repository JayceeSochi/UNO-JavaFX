package org.example.unoapp;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.ResourceBundle;

public class GameController implements Initializable {
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

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        System.out.println(HelloController.numPlayers);
    }
}
