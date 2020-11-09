package world.ucode.Controller;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.util.Duration;
import world.ucode.scenes.LoadGame;
import world.ucode.scenes.NewGame;
import world.ucode.scenes.NewWindow;
import java.io.IOException;


public class ControllerGameMenu {
    Timeline timeline;

    @FXML
    void buttonLoadGame() throws IOException {
        LoadGame l_menu = new LoadGame();
    }

    @FXML
    void button_NewGame() throws IOException {
        NewGame new_game = new NewGame();
    }

    @FXML
    void button_Exit() throws IOException {
        timer();
    }

    public void timer() throws IOException {
        timeline = new Timeline(
                new KeyFrame(Duration.seconds(1), e -> {
                })
        );
        new NewWindow("/FXML/End.fxml");
        timeline.setCycleCount(4);
        timeline.play();
    }

}

