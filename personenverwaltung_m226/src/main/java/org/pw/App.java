package org.pw;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.w3c.dom.NodeList;

import java.io.File;
import java.io.FileInputStream;

import static javafx.application.Application.launch;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        FileInputStream = new File(String.valueOf(getClass().getClassLoader().getResource("main.fxml")));
        System.out.println(d.isFile());
        Parent root = FXMLLoader.load(getClass().getResource("resources/main.fxml"));
        primaryStage.setScene(new Scene(root));
        primaryStage.setResizable(false);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}

