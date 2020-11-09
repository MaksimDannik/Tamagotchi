package world.ucode.Controller;

import com.sun.scenario.effect.impl.prism.ps.PPSBlend_GREENPeer;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import world.ucode.Player.Pet;
import world.ucode.scenes.Game;
import world.ucode.scenes.NewWindow;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ResourceBundle;

public class ControllerNewGame implements Initializable {

    @FXML
    void buttonCat() throws IOException{
//        System.out.println("Cat");
//        Game play_game = new Game();
        world.ucode.Controller.ControllerPlayGame.setPlayer("Cat");
        Pet.name = text_Name.getText();
        Pet.player = "Cat";

    }

    @FXML
    void button_back() throws IOException {
        new NewWindow("/FXML/GameMenu.fxml");
    }


    @FXML
    void buttonDonkey() throws IOException {
        world.ucode.Controller.ControllerPlayGame.setPlayer("Donkey");
        Pet.name = text_Name.getText();
        Pet.player = "Donkey";
    }

    @FXML
    void buttonShrek() throws IOException {
        world.ucode.Controller.ControllerPlayGame.setPlayer("Shrek");
        Pet.name = text_Name.getText();
        Pet.player = "Shrek";

    }


    @FXML
    Button Bdonkey;

    @FXML
    Button Bshrek;

    @FXML
    Button Bcat;

    @FXML
    TextField text_Name;///

    public void initialize(URL url, ResourceBundle resourceBundle) {
        Bdonkey.setOnMouseEntered(e -> Bdonkey.setStyle("-fx-background-color: tranporant;-fx-border-color: darkgreen; -fx-border-width : 1px"));
        Bdonkey.setOnMouseExited(e -> Bdonkey.setStyle("-fx-background-color: tranporant;"));
        Bshrek.setOnMouseEntered(e ->Bshrek.setStyle("-fx-background-color: tranporant;-fx-border-color: darkgreen; -fx-border-width : 1px"));
        Bshrek.setOnMouseExited(e -> Bshrek.setStyle("-fx-background-color: tranporant;"));
        Bcat.setOnMouseEntered(e -> Bcat.setStyle("-fx-background-color: tranporant;-fx-border-color: darkgreen; -fx-border-width : 1px"));
        Bcat.setOnMouseExited(e -> Bcat.setStyle("-fx-background-color: tranporant;"));
    }

}
