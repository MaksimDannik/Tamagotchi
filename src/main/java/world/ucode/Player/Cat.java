package world.ucode.Player;


import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.awt.*;
import java.awt.image.ImageProducer;
import java.net.URISyntaxException;

public class Cat extends  Pet {
//    Image image;
//    Cat () throws URISyntaxException {
//        image = new Image("/FXML/gif.gif");
//    }


    @Override
    public void inizializade() {
        super.inizializade();
    }

    @Override
    public void play() {
        super.play();
    }

    @Override
    public void feed() {
        super.feed();
    }

    @Override
    public void give_water() {
        super.give_water();
    }

    @Override
    public void give_Medicine() {
        super.give_Medicine();
    }

    @Override
    public void clean_up() {
        super.clean_up();
    }

    @Override
    public String setPet() {
        return "/FXML/cat.png";
    }



//    @Override
//    public String setPet() {
//        return "/FXML/gif.gif";
//    }





    //    @FXML
//    private ImageView imageview;
//
//    @FXML
//    public void initialize() throws URISyntaxException {
//        System.out.println("second");
//        Image i = new Image(getClass().getResource("/FXML/gif.gif").toURI().toString());
//        imageview.setImage(i);
//    }
}
