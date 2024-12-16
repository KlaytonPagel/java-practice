package org.example.learning;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {

//        Set up root node and the scene---------------------------------------
        Group root = new Group();
        Scene scene = new Scene(root, 800, 600, Color.rgb(100, 100, 100));

//        Set up text----------------------------------------------------------
        Text text = new Text();
        text.setText("Welcome to the Homepage");
        text.setY(100);
        text.setX(55);
        text.setFont(Font.font("Verdana", 51));
        text.setFill(Color.rgb(100, 0, 100));
        root.getChildren().add(text);

        stage.setTitle("Main Window");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}