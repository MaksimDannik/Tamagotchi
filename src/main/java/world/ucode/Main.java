package world.ucode;
import javafx.application.Application;
import javafx.stage.Stage;
import world.ucode.Controller.ControllerPlayGame;
import world.ucode.Controller.DataBase;
import world.ucode.Player.Pet;
import world.ucode.scenes.NewWindow;
import java.io.IOException;
import java.sql.SQLException;

public class Main extends Application
{
    public static Stage stage;

    NewWindow window;
    @Override
    public void start(Stage primaryStage) throws IOException, SQLException, ClassNotFoundException {
//        try {
//            DataBase.connect();
//            DataBase.create();
//            stage = primaryStage;
//            window = new NewWindow("/FXML/GameMenu.fxml");
//        }
//        DataBase.connect();

        DataBase.connect();
        DataBase.create();

        stage = primaryStage;
        window = new NewWindow("/FXML/GameMenu.fxml");
//        catch (Exception exception) {
//            System.out.println(exception);
//            System.out.println("HERE");
//        }
    }
    public static void main(String[] args) {
                Application.launch(args);
    }
}

