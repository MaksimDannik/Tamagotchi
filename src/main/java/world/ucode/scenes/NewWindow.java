package world.ucode.scenes;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import java.io.IOException;
import java.net.URL;
import javafx.stage.Stage;
import world.ucode.Main;


public class NewWindow {
    Stage stage;
    Scene scene;

   public NewWindow(String str) throws IOException {
        stage = Main.stage;
        showScene(str);
    }
    public void showScene(String str) throws IOException {
        FXMLLoader loader = new FXMLLoader();

        URL xmlUrl = getClass().getResource(str);
        loader.setLocation(xmlUrl);
        Pane root = loader.load();
        scene = new Scene(root);

        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }
}
