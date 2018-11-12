package fr97;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;


public class App extends Application {



    public void start(Stage primaryStage) throws Exception {

        Label lbl = new Label("asd");
        Scene scene = new Scene(lbl, 640, 480);

        primaryStage.setTitle("LinkedIn Parser");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
