package world.ucode.Controller;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import world.ucode.Player.Pet;
import world.ucode.scenes.NewWindow;

import java.awt.*;
import java.io.IOException;
import java.sql.SQLException;

public class ControllerLoadGame {

    public String name;

    public void button_start() throws SQLException, IOException {
         double[] value = new double[5];
        setName();

            value = DataBase.read(name);
            if (value == null) {
                System.out.println("Нет питомца");
            }
            else {
                Pet.health = value[0];
                Pet.happy = value[1];
                Pet.hunger = value[2];
                Pet.thirst = value[3];
                Pet.cleanliness = value[4];
            }
//                setName();
//                DataBase.read(name);

                if (value != null) {
                    System.out.println("all good");
                    world.ucode.Controller.ControllerPlayGame.setPlayer(world.ucode.Controller.DataBase.set_player(name));
                } else {
                    System.out.println("Sorry man. you dont have this pet ");
                }
    }
    @FXML
    public void return_menu() throws IOException {
        NewWindow nv = new NewWindow("/FXML/GameMenu.fxml");
    }
//
//
    @FXML
    TextField TField;
//
    public void setName() {
        name = TField.getText();
    }
}
