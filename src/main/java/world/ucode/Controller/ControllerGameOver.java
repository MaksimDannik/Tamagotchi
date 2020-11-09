package world.ucode.Controller;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;
import world.ucode.scenes.NewWindow;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ControllerGameOver implements Initializable {
    @FXML
    Button kk;

    static public Image i;
    public ImageView picture;
    public AnchorPane pane;

    static Timeline timeline;
    static Timeline timeline2;

    @FXML
    void kk() throws IOException {
        stop();
//        up();
    }

//    public void up()  {
//         timeline = new Timeline(
//                new KeyFrame(Duration.seconds(1), e -> {
//                    System.out.println("PPPPPP");
//                })
//        );
//        timeline.setCycleCount(Timeline.INDEFINITE);
//        timeline.play();
//        gif();
//
//        timeline2 = new Timeline(
//                new KeyFrame(Duration.seconds(4.5), e -> {
//                    try {
//                        stop();
//                    } catch (IOException ioException) {
//                        ioException.printStackTrace();
//                    }
//                })
//        );
//        timeline2.setCycleCount(Timeline.INDEFINITE);
//        timeline2.play();
//
//    }
    public static void stop() throws IOException {
//        timeline.stop();
//        timeline2.stop();
        world.ucode.Controller.ControllerPlayGame.pet.inizializade();
        NewWindow nw  = new NewWindow("/FXML/GameMenu.fxml");
    }

    public void initialize(URL url, ResourceBundle resourceBundle)  {
        kk.setOnMouseClicked(e -> kk.setStyle("-fx-background-color: visibility; -fx-text-fill: none;"));
    }


    public void gif()  {
//        i = new Image(ControllerPlayGame.class.getResource("/FXML/Catgif.gif").toString());
//        picture.setImage(i);

    }
}
