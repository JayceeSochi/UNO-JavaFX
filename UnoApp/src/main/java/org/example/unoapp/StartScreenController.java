package org.example.unoapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;

import java.io.IOException;

public class StartScreenController {
    @FXML
    private ChoiceBox<Integer> choiceBox;

    @FXML
    public void initialize() {
        choiceBox.getItems().addAll(2, 3, 4, 5, 6, 7, 8, 9, 10);
        choiceBox.setValue(2);
    }

    @FXML
    protected void onGameStart(ActionEvent event) throws IOException {
        // Placeholder (Testing Number Of Players)
        Game.setPlayerCount(choiceBox.getValue());

        Game.InitializeGame();

        ChangeScene.changeScene(event, "game-screen.fxml");
    }
}
