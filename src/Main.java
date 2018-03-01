
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        Parent root = FXMLLoader.load(getClass().getResource("GUI/Kursustilmeldning.fxml"));
        primaryStage.setTitle("Kursustilmeldning");
        primaryStage.setScene(new Scene(root, 800, 600));
        primaryStage.show();

    }

    public static void main(String[] args) {
        System.out.println("***********************************\nVelkommen til Næstved Ungdomsskoles\nadministrationssystem!\n***********************************");

        TestSystem t = new TestSystem();
        t.init();

        // Jeg udkommenterer launch, så GUI'en ikke starter
        launch(args);

    }
}
