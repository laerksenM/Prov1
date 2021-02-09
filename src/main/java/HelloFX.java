import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.application.Application;



public class HelloFX extends Application {


    @Override
    public void start(Stage stage) throws Exception { //stage er javaFX's vindue, hvor alle elementer kan vises
        String version = System.getProperty("javafx.version");
        Label label = new Label("Hello from JavaFX:" + version);
        StackPane stackPane = new StackPane(label);
        Scene scene = new Scene(stackPane,640,400);
        stage.setScene(scene);
        stage.show();
    }
}