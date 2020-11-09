package world.ucode.Controller;

import javafx.animation.AnimationTimer;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.util.Duration;
import org.xml.sax.helpers.AttributesImpl;
import world.ucode.Player.Cat;
import world.ucode.Player.Donkey;
import world.ucode.Player.Pet;
import world.ucode.Player.Shrek;
import world.ucode.scenes.Game;
import world.ucode.scenes.Game_over;

import javax.swing.*;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ResourceBundle;


public class ControllerPlayGame implements Initializable{
    static public Pet pet;
    static public Image i;
    public ImageView imageview; // image for pet

    public ProgressBar barPlay; // ProgressBar
    public ProgressBar barGiveWater; // ProgressBar
    public ProgressBar barFeed;
    public ProgressBar barGiveMedicine;
    public ProgressBar barClean_up;

    static Timeline timeline;
    static Timeline line;

    public void  up() {
                timeline = new Timeline(
                new KeyFrame(Duration.seconds(1), e -> {
                    pet.happy -= 0.01;
                    pet.thirst -= 0.01;
                   pet.health -= 0.01;
                    pet.cleanliness -= 0.01;
                    pet.hunger -= 0.01;
                    barGiveWater.setProgress(pet.thirst);
                    barPlay.setProgress(pet.happy);
                    barFeed.setProgress(pet.hunger);
                    barGiveMedicine.setProgress(pet.health);
                    barClean_up.setProgress(pet.cleanliness);
                    System.out.println("gello");
                })
        );
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();

        line = new Timeline(
                new KeyFrame(Duration.seconds(1), e -> {
                    if (pet.happy >= 1 || pet.health >= 1 || pet.hunger >= 1 || pet.cleanliness >= 1 || pet.thirst >= 1 ||
                            pet.happy <= 0 || pet.health <= 0 || pet.hunger <= 0 || pet.cleanliness <= 0 || pet.thirst <= 0) {
                        try {
                            stop_Line();
                        } catch (IOException | SQLException ioException) {
                            ioException.printStackTrace();
                        }
                    }
                })
        );
        line.setCycleCount(Timeline.INDEFINITE);
        line.play();
    }

    static  public void setPlayer(String pet) throws IOException {
        chose_player(pet);
        Game play_game = new Game();
    }

     public static void stop_Line() throws IOException, SQLException {
        line.stop();
        timeline.stop();
         DataBase.writeS(Pet.name, Pet.player,pet.health, pet.happy, pet.hunger, pet.thirst, pet.cleanliness);
        Game_over gm = new Game_over();
    }

    static public void chose_player(String name_players)  {
        switch (name_players) {
            case "Cat":   pet = new Cat(); break;
            case "Donkey":   pet = new Donkey(); break;
            case "Shrek":   pet = new Shrek(); break;
            }

    }
    @FXML
    Button Click; // button Click me!

    @FXML
    void Click() { // show pet
        up();
        i = new Image(ControllerPlayGame.class.getResource(pet.setPet()).toString());
        imageview.setImage(i);
    }


    @FXML
    void givewater() {
        thirst();
    }

    void thirst() {
        barGiveWater.setProgress(pet.thirst);
        pet.give_water();
    }


    void happy() {
        barPlay.setProgress(pet.happy);
        pet.play();
    }

    @FXML
     void play() {
        happy();
    }


    @FXML
    void feed() {
        hunger();
    }

    void hunger() {
        barFeed.setProgress(pet.hunger);
        pet.feed();
    }

    @FXML
    void givemedecine() {
        health();
    }

    void health() {
         barGiveMedicine.setProgress(pet.health);
            pet.give_Medicine();
    }

    @FXML
    void clean() {
        cleanliness();
    }

    void cleanliness() {
        barClean_up.setProgress(pet.cleanliness);
        pet.clean_up();
    }

    public void initialize(URL url, ResourceBundle resourceBundle)  {
        pet.inizializade();
        Click.setOnMouseClicked(e -> Click.setStyle("-fx-background-color: visibility; -fx-text-fill: none;"));
    }


}
