package world.ucode.Controller;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.Initializable;
import javafx.util.Duration;
import java.net.URL;
import java.util.ResourceBundle;

public class ControllerEnd implements Initializable {
    Timeline line;
    Timeline timeline;

    public void up() {
             timeline = new Timeline(
                new KeyFrame(Duration.seconds(4.5), e -> {
                    exiT();
                })
        );
        timeline.setCycleCount(4);
        timeline.play();

        line = new Timeline(
                new KeyFrame(Duration.seconds(1), e -> {
                })
        );
        line.setCycleCount(Timeline.INDEFINITE);
        line.play();
    }

    public void exiT() {
        line.stop();
        System.exit(0);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        up();
    }
}
